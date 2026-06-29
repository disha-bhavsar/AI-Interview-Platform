package com.example.demo.controller;

import com.example.demo.model.Result;
import com.example.demo.repository.ResultRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/results")
@CrossOrigin("*")

public class ResultController {

    private final ResultRepository resultRepository;

    public ResultController(
            ResultRepository resultRepository) {

        this.resultRepository = resultRepository;
    }

    @PostMapping("/save")

    public Result saveResult(
            @RequestBody Result result) {

        return resultRepository.save(result);
    }

    

    @GetMapping("/all")

    public List<Result> getAllResults() {

        return resultRepository.findAll();
    }
}