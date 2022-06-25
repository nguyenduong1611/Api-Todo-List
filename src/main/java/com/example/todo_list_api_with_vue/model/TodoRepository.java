package com.example.todo_list_api_with_vue.model;

import com.example.todo_list_api_with_vue.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    void deleteTodoById(int id);
}
