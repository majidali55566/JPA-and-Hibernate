package com.majid.JPA.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.majid.JPA.practice.entity.User;
import com.majid.JPA.practice.service.UserRepository;
@Component
public class UserDaoServiceCommandLineRunner2 implements CommandLineRunner  {

	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
	
		User inayatullah=new User("Inayatullah", "Admin");
		repository.save(inayatullah);
	}

}
