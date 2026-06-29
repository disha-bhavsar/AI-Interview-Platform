package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.model.Result;
import com.example.demo.model.InterviewRequest;

import com.example.demo.repository.QuestionRepository;
import com.example.demo.repository.ResultRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
@CrossOrigin("*")

public class InterviewController {

    private final QuestionRepository questionRepository;
    private final ResultRepository resultRepository;

    public InterviewController(
            QuestionRepository questionRepository,
            ResultRepository resultRepository) {

        this.questionRepository = questionRepository;
        this.resultRepository = resultRepository;
    }

    // GET QUESTIONS
    @GetMapping("/questions")
    public List<Question> getQuestions() {

        return questionRepository.findAll();
    }

    // SUBMIT ANSWERS
    @PostMapping("/submit")
    public Result submitInterview(
            @RequestBody InterviewRequest request) {

        List<Question> questions =
                questionRepository.findAll();

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {

            String correctAnswer =
                    questions.get(i).getCorrectAnswer();

            String userAnswer =
                    request.getAnswers().get(i);

            if (correctAnswer.equalsIgnoreCase(userAnswer)) {

                score++;
            }
        }

        Result result = new Result();

        result.setUserEmail(request.getUserEmail());

        result.setScore(score);

        result.setTotalQuestions(
                questions.size());

        return resultRepository.save(result);
    }
}