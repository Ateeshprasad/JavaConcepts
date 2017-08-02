package com.utils;

import java.lang.reflect.Field;
import java.util.Map;

public class BeanUtils {

	public void fillBean(Map<Object, Object> data) {
		try {

			for (Object key : data.keySet()) {
				for (Field field : this.getClass().getDeclaredFields()) {
					field.setAccessible(true);
					if (field.getName().equalsIgnoreCase(String.valueOf(key))) {
						if (field.getType() == String.class)
							field.set(this, String.valueOf(data.get(key)));
						else if (field.getType() == Integer.TYPE)
							field.set(this, Integer.parseInt((String) data.get(key)));
						else if (field.getType() == Double.TYPE)
							field.set(this, Double.parseDouble((String) data.get(key)));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
