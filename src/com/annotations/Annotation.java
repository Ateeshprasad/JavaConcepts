package com.annotations;

import java.lang.annotation.Target;

import com.enums.JavaEnums.Seasons;


public @interface Annotation {

	String name();
	
	String description();
}
