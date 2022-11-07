package com.joaovictor.CadastroMongodb.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joaovictor.CadastroMongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findALL() {
		User joao = new User("1", "João Victor", "jomiem2014@gmail.com");
		User bia = new User("2", "Ana Beatriz", "bia@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(joao, bia));
		return ResponseEntity.ok().body(list);
		
	}
}
