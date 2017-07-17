package com.danielme.spring.test;

import org.springframework.stereotype.Component;

@Component
public class SubDependency {

	public String getClassName() {
		return this.getClass().getSimpleName();
	}
}
