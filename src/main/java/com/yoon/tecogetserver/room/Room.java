package com.yoon.tecogetserver.room;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Room {
    private int id;
    private String title;
    private int current_num;
    private int is_playing;
}
