package com.yoon.tecogetserver.question;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionDaoService {
    private static List<Question> questions = new ArrayList<>();

    static {
        questions.add(new Question(1, "Apple"));
        questions.add(new Question(2, "Banana"));
        questions.add(new Question(3, "Coconut"));
    }

    public Question takeRandomQuestion() {
        return questions.get(0);
    }
}
