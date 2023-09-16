package com.spring.todoapplication.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	public List<Todo> findByUsername(String username);
}
