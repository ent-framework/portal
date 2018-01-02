package com.liferay.portal.dao.orm.hibernate;

import com.liferay.portal.kernel.util.StringPool;
import org.hibernate.internal.util.ReflectHelper;
import org.hibernate.property.access.internal.PropertyAccessFieldImpl;
import org.hibernate.property.access.internal.PropertyAccessStrategyFieldImpl;
import org.hibernate.property.access.spi.*;

import java.lang.reflect.Field;

public class PrivatePropertyAccessor extends PropertyAccessStrategyFieldImpl {

    @Override
    public PropertyAccess buildPropertyAccess(Class containerJavaType, String propertyName) {
        propertyName = StringPool.UNDERLINE.concat(propertyName);

        return new PropertyAccessFieldImpl(this,containerJavaType,propertyName);
    }
}
