/**
 * 
 */
package com.todolistapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.todolistapp.entity.ToDoList;

/**
 * @author dpotana
 *
 */
public class ToDoListService {

	private static final String PERSISTENCE_UNIT_NAME = "todolist";
	private static EntityManagerFactory factory;

	public int fetchNoOfTasksOpen() {

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager entitymanager = factory.createEntityManager();
		Query query = entitymanager.createNamedQuery("fetchData");
		List<ToDoList> toDoList = query.getResultList();
		return toDoList.size();

	}
}
