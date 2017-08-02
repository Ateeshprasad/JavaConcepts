package com.beans;

import com.utils.BeanUtils;

/**
 * 
 * @author ateeshprasad.palla
 *
 */

public class Bean extends BeanUtils {

	private String name;

	private String city;

	private int age;

	private double balance;

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

	public double getBalance() {
		return balance;
	}

}
