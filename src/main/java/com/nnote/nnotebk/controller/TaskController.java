package com.nnote.nnotebk.controller;

import com.nnote.nnotebk.routes.Task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private final String testString = "Other %s";

    @GetMapping("/task")
    public Task handleTask(@RequestParam(value = "title", defaultValue="Default Title")
    String taskTitle){
        return new Task(String.format(testString, taskTitle));
    }
}
