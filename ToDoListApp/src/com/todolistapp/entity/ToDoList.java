/**
 * 
 */
package com.todolistapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author dpotana
 *
 */
@Entity
@Table(name = "TODO_LIST")
public class ToDoList {

	@Id
	@GeneratedValue(generator = "TodoListseq")
	@SequenceGenerator(name = "TodoListseq", sequenceName = "TODOLIST_SEQ")
	@Column(name = "ID")
	private int id;

	@Column(name = "TASK_NAME")
	private String taskName;

	@Column(name = "TASK_COMPLETION_DATE")
	private Date taskCompletionDate;

	@Column(name = "NO_OF_HOURS_REQUIRED_TO_FINISH")
	private int noOfHoursRequiredToFinish;

	@Column(name = "STATUS")
	private String status;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName
	 *            the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the taskCompletionDate
	 */
	public Date getTaskCompletionDate() {
		return taskCompletionDate;
	}

	/**
	 * @param taskCompletionDate
	 *            the taskCompletionDate to set
	 */
	public void setTaskCompletionDate(Date taskCompletionDate) {
		this.taskCompletionDate = taskCompletionDate;
	}

	/**
	 * @return the noOfHoursRequiredToFinish
	 */
	public int getNoOfHoursRequiredToFinish() {
		return noOfHoursRequiredToFinish;
	}

	/**
	 * @param noOfHoursRequiredToFinish
	 *            the noOfHoursRequiredToFinish to set
	 */
	public void setNoOfHoursRequiredToFinish(int noOfHoursRequiredToFinish) {
		this.noOfHoursRequiredToFinish = noOfHoursRequiredToFinish;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
