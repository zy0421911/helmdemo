package com.example.simple;

public enum SeasonEnum {
    SPRING(1),
    SUMMER(2),
    AUTUMN(3),
    WINTER(4);

    private int season;

    SeasonEnum(int seq) {
        this.season = seq;
    }

}
