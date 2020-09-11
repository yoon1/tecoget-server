package com.yoon.tecogetserver.question;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Question {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
