package com.springboot.learnspringsecurity.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

record ToDo(String name, String description) {
}

public class ToDoResources {

	private static final List<ToDo> AS_LIST = Arrays.asList(new ToDo("Learn", " Spring security"),
			new ToDo("Learn", "spring and Java"));

	@GetMapping("/todos")
	public List<ToDo> todos() {
		return AS_LIST;
	}

	@GetMapping("/todos/users/{name}")
	public ToDo retrieveTodos(@PathVariable String name) {
		return AS_LIST.get(1);
	}

	@PostMapping("/todos/users/post")
	public void retrieveTodos(@RequestBody ToDo t) {
		AS_LIST.add(t);
	}
}
