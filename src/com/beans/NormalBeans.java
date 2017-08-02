package com.beans;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author ateeshprasad.palla
 *
 */

public class NormalBeans {

	public static void main(String[] args) {
		
		Bean bean=new Bean();
		
		Map<Object, Object> data=new TreeMap<Object,Object>();
		
		data.put("name", "Satya");
		data.put("city", "Pune");
		data.put("age", "35");
		data.put("balance", "25000");
		
		bean.fillBean(data);
		
		System.out.println("Name: "+bean.getName());
		System.out.println("City: "+bean.getCity());
		System.out.println("Age: "+bean.getAge());
		System.out.println("Balance: "+bean.getBalance());
	}
}
