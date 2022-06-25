package com.example.todo_list_api_with_vue.service;

import com.example.todo_list_api_with_vue.entity.Todo;
import com.example.todo_list_api_with_vue.model.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public Todo addTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public List<Todo> findAllTodo(){
        return todoRepository.findAll();
    }

    public Todo updateTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Integer id){
        todoRepository.deleteTodoById(id);
    }
}
