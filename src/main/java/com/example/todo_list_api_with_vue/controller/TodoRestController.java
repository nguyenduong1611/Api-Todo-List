package com.example.todo_list_api_with_vue.controller;

import com.example.todo_list_api_with_vue.entity.Todo;
import com.example.todo_list_api_with_vue.model.TodoRepository;
import com.example.todo_list_api_with_vue.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/todo")
public class TodoRestController {
    private final TodoService todoService;
    private final TodoRepository todoRepository;

    @GetMapping()
    public ResponseEntity<List<Todo>> getAllEmployees(){
        List<Todo> employees = todoService.findAllTodo();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Todo> addEmployee(@RequestBody Todo todo){
        Todo newTodo = todoService.addTodo(todo);
        return new ResponseEntity<>(newTodo, HttpStatus.CREATED);
    }

    @PutMapping("")
    public ResponseEntity<Todo> updateEmployee(@RequestBody Todo todo){
        Todo updateTodo = todoService.updateTodo(todo);
        return new ResponseEntity<>(updateTodo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") int id){
        todoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
