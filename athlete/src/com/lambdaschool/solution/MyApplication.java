package com.lambdaschool.solution;

public class MyApplication implements Processor {
    private DisplayService displayService;

    public MyApplication(DisplayService displayService) {
        this.displayService = displayService;
    }

    @Override
    public void displayAthlete() {
        System.out.println("************");
        System.out.println(displayService.displayAthlete());
        System.out.println("************\n");
    }
}
