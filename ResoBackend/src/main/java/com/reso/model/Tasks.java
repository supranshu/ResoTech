package com.reso.model;


import org.springframework.stereotype.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long taskid;
	private String taskName;
	private String discription;
	public long getTaskid() {
		return taskid;
	}
	public void setTaskid(long taskid) {
		this.taskid = taskid;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Tasks [taskid=" + taskid + ", taskName=" + taskName + ", discription=" + discription + "]";
	}
	public Tasks(long taskid, String taskName, String discription) {
		super();
		this.taskid = taskid;
		this.taskName = taskName;
		this.discription = discription;
	}
	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
