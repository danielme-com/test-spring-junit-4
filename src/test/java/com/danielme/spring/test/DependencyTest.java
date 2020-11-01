package com.danielme.spring.test;
import static org.junit.Assert.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfiguration.class})
@TestPropertySource("classpath:test.properties")
public class DependencyTest {

	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();
	@Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

	@Autowired
	private Dependency dependency;

	@Test
	public void testDependency(){
		assertEquals(dependency.getClass().getSimpleName(), dependency.getClassName());
	}

	@Test
	public void testAddTwo(){
		assertEquals(3, dependency.addTwo(1));
	}

	@Test
	public void testSubdependency(){
		assertEquals(SubDependency.class.getSimpleName(), dependency.getSubdependencyClassName());
	}

	@Test
	public void testUrl(){
		assertEquals("http://danielmedina.info", dependency.getUrl());
	}
}
