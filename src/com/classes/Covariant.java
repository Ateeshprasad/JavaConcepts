package com.classes;

public class Covariant {

	public static void main(String[] args) {
		new Duplicate().method().printMessage();
		//new Duplicate().method().print();
	}
	
}

class Real
{
	public Real method() {
		System.out.println("Real");
		return this;
	}
	
	public void printMessage() {
		System.out.println("Real Class");
	}
	

}

class Duplicate extends Real
{
	/*public Duplicate method() {
		System.out.println("Duplicate");
		return this;
	}*/
	
	public void printMessage() {
		System.out.println("Duplicate Class");
	}
}
