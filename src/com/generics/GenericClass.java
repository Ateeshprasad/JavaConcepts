package com.generics;

class car<T> {

	public T t;

	public T getT() {
		return t;
	}

	public void addNum(T t1) {
		t = t1;
	}
}

class prof {
	int a;
	int b;
	
	void setA(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	int getAB() {
		return (a*b);
	}
}

class myCar extends car<prof> {
	public int myCarMethod() {
		return getT().getAB();
	}
}

public class GenericClass {

	public static void main(String args[]) {
		myCar c=new myCar();
		c.addNum(new prof());
		c.getT().setA(5, 36);
		System.out.println(	c.myCarMethod());
	}
	
}
