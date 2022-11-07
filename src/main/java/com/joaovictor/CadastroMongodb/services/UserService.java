package com.joaovictor.CadastroMongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaovictor.CadastroMongodb.domain.User;
import com.joaovictor.CadastroMongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findALL(){
		return repo.findAll();
	}
}
