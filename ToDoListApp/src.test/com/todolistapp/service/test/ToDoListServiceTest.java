/**
 * 
 */
package com.todolistapp.service.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.todolistapp.service.ToDoListService;

/**
 * @author dpotana
 *
 */
public class ToDoListServiceTest {

	/*	*//**
			 * @throws java.lang.Exception
			 */
	/*
	 * @Before public void setUp() throws Exception { }
	 * 
	 *//**
		 * @throws java.lang.Exception
		 *//*
		 * @After public void tearDown() throws Exception { }
		 */

	/**
	 * Test method for
	 * {@link com.todolistapp.service.ToDoListService#fetchNoOfTasksOpen()}.
	 */
	@Test
	public void testFetchNoOfTasksOpen() {
		ToDoListService service = new ToDoListService();

		int size = service.fetchNoOfTasksOpen();

		assertEquals(2, size);

	}

}
