package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    // "This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."
    public String getDescription() {
        String wordPaws;
        wordPaws = this.getNumberOfPaws() > 1 ? "paws" : "paw";
        String articleBeforeFur;
        articleBeforeFur = this.isHasFur() ? "a" : "no";
        return "This animal is mostly " + this.getColor() +". It has "+ this.getNumberOfPaws() + " " + wordPaws + " and " + articleBeforeFur + " fur.";
    }

}
