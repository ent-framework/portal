/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.dao.orm.hibernate;

import java.io.Serializable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;
import org.hibernate.usertype.CompositeUserType;

/**
 * @author Brian Wing Shun Chan
 */
public class FloatType implements CompositeUserType, Serializable {

	public static final Float DEFAULT_VALUE = Float.valueOf(0);

	@Override
	public Object deepCopy(Object obj) {
		return obj;
	}

	@Override
	public boolean equals(Object x, Object y) {
		if (x == y) {
			return true;
		}
		else if ((x == null) || (y == null)) {
			return false;
		}
		else {
			return x.equals(y);
		}
	}

	@Override
	public String[] getPropertyNames() {
		return new String[0];
	}

	@Override
	public Type[] getPropertyTypes() {
		return new Type[] {StandardBasicTypes.FLOAT};
	}

	@Override
	public Object getPropertyValue(Object component, int property) {
		return component;
	}

	@Override
	public int hashCode(Object x) {
		return x.hashCode();
	}

	@Override
	public boolean isMutable() {
		return false;
	}


	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner) throws HibernateException, SQLException {
		Float value = StandardBasicTypes.FLOAT.nullSafeGet(
				rs, names[0], session);

		if (value == null) {
			return DEFAULT_VALUE;
		}
		else {
			return value;
		}
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws HibernateException, SQLException {
		if (value == null) {
			value = DEFAULT_VALUE;
		}

		st.setFloat(index, (Float)value);
	}

	@Override
	public Serializable disassemble(Object value, SharedSessionContractImplementor session) throws HibernateException {
		return (Serializable)value;
	}

	@Override
	public Object assemble(Serializable cached, SharedSessionContractImplementor session, Object owner) throws HibernateException {
		return cached;
	}

	@Override
	public Object replace(Object original, Object target, SharedSessionContractImplementor session, Object owner) throws HibernateException {
		return original;
	}

	@Override
	public Class<Float> returnedClass() {
		return Float.class;
	}

	@Override
	public void setPropertyValue(Object component, int property, Object value) {
	}

}