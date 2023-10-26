package com.TODO.Silas.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ToDoController {
    var todoList: MutableList<ToDo> = mutableListOf()

    @GetMapping("/todos")
    fun getTodos(): List<ToDo> {
        return todoList
    }
    @PostMapping("/todos")
    fun addTodos(@RequestBody inputToDo: ToDo):ToDo {
       todoList.add(inputToDo)

       return inputToDo
    }
}