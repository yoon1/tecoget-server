package com.yoon.tecogetserver.question;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class QuestionController {
    private final QuestionDaoService questionService;
    private HttpHeaders httpHeaders = new HttpHeaders();

    @GetMapping(path="/question")
    public ResponseEntity<Question> getQuestion() {
        Question question = questionService.takeRandomQuestion();

        return new ResponseEntity<Question>(question, httpHeaders, HttpStatus.OK);
    }
}
