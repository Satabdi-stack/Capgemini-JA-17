package com.capgemini.Author.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthorTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Author au;
	Author au1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("Before all cases this is happening");
	au=new Author("sat","satty@abc.com",'f');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all cases this is happening");
		au=null;  //eligible for garbage collector
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test case this is happening");
		au1=new Author();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test case this is happening");
		au1=null;
	}

	
	@Test
	void testAuthor() {
		assertEquals(new Author(),au1);
	}

	
	/**
	 *  Test method for {@link com.capgemini.author.model.Author#getName()}.
	 */
	@Test
	void testGetName() {
		assertEquals("sat",au.getName());
	}


	/**
	 *  Test method for {@link com.capgemini.author.model.Author#getEmail()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("satty@abc.com",au.getEmail());
	}

	

	/**
	 * Test method for {@link com.capgemini.author.model.Author#getGender()}.
	 */
	@Test
	void testGetGender() {
		assertEquals('f',au.getGender());
	}

	
}