/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.spring.aop;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.util.ClassLoaderUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.core.Ordered;

import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuyang Zhou
 */
public class DynamicProxyCreator
        extends InstantiationAwareBeanPostProcessorAdapter implements Ordered {

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        Class<?> beanClass = bean.getClass();

        for (ObjectValuePair<BeanMatcher, InvocationHandlerFactory>
                objectValuePair : _beanMatcherInvocationHandlerFactories) {

            BeanMatcher beanMatcher = objectValuePair.getKey();

            if (beanMatcher.match(beanClass, beanName)) {
                InvocationHandlerFactory invocationHandlerFactory =
                        objectValuePair.getValue();

                InvocationHandler invocationHandler =
                        invocationHandlerFactory.createInvocationHandler(bean);

                bean = ProxyUtil.newProxyInstance(
                        ClassLoaderUtil.getContextClassLoader(),
                        beanClass.getInterfaces(), invocationHandler);
            }
        }

        return bean;
    }

    public void setRegisters(List<Register> registers) {
        if (registers!=null) {
            for (Register register : registers) {
                this._beanMatcherInvocationHandlerFactories.add(register.objectValuePair);
            }
        }
    }

    public static class Register {

        private ObjectValuePair objectValuePair;

        public Register(
                BeanMatcher beanMatcher,
                InvocationHandlerFactory invocationHandlerFactory) {
            this.objectValuePair = new ObjectValuePair<BeanMatcher, InvocationHandlerFactory>(beanMatcher, invocationHandlerFactory);
        }

    }

    private List<ObjectValuePair<BeanMatcher, InvocationHandlerFactory>>
            _beanMatcherInvocationHandlerFactories =
            new ArrayList
                    <ObjectValuePair<BeanMatcher, InvocationHandlerFactory>>();

}