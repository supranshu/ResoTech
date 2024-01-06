package com.reso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reso.model.Tasks;

@Repository
public interface TaskRepo extends JpaRepository<Tasks, Long> {

	public Tasks findTasksByTaskName(String taskName);
}
