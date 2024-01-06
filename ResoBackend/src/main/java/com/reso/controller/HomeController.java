package com.reso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reso.model.Tasks;
import com.reso.model.User;
import com.reso.repositories.TaskRepo;
import com.reso.repositories.UserRepo;

@CrossOrigin("*")
@RequestMapping("/task")
@RestController
public class HomeController {

	@Autowired
	private TaskRepo taskRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/admin-login")
	public boolean adminLogin(@RequestBody User user) {
		
		User user1=(User) userRepo.findUserByUsername(user.getUsername());
		
		
		if(user1.getRole().equals("ADMIN") && user.getPassword().equals(user1.getPassword())) {
			return true;
		}
		return false;
	}
	
	@PostMapping("/login")
	public boolean login(@RequestBody User user) {
		User user1=(User) userRepo.findUserByUsername(user.getUsername());
				user.setUserid(user1.getUserid());
				if(user.getPassword().equals(user1.getPassword())) {
					return true;
				}
				return false;
	}
	
	@GetMapping("/tasks")
	public List<Tasks> getAllTasks(){
		 
		List<Tasks> alltasks=taskRepo.findAll();
		return alltasks;
	}
	
	@PostMapping("/")
	public Tasks saveTask(@RequestBody Tasks task) {
		
		Tasks task1=taskRepo.save(task);
		return task1;
	}
	@DeleteMapping("/{taskName}")
	public void removeTask(@PathVariable("taskName") String taskName) {
		
			Tasks task=taskRepo.findTasksByTaskName(taskName);
			taskRepo.delete(task);
		
	}
}
