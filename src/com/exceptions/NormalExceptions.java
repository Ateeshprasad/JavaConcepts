package com.exceptions;

import java.io.File;

public class NormalExceptions {

	public static void main(String[] args) throws myException {
		int a=10;
		int b=0;
		int c=0;
		int[] ar=new int[5];
		
		throw new myException(15);
	}

}

class myException extends Exception {
	
	int a;
	
	public myException(int a)
	{
		this.a=a;
	}
	
	public int getA() {
		return this.a;
	}
}
