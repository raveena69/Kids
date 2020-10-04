package com.example.kids;

public class AdditionTable {

    private int additionalNum1;
    private int  additionalNum2;
    private int  userAnswer;
    private int correctAnswer;
    private boolean result;

    public AdditionTable(int additionalNum1, int additionalNum2, int userAnswer, int correctAnswer, boolean result) {
        this.additionalNum1 = additionalNum1;
        this.additionalNum2 = additionalNum2;
        this.userAnswer = userAnswer;
        this.correctAnswer = correctAnswer;
        this.result = result;
    }

    public AdditionTable() {
    }

    public int getAdditionalNum1() {
        return additionalNum1;
    }

    public void setAdditionalNum1(int additionalNum1) {
        this.additionalNum1 = additionalNum1;
    }

    public int getAdditionalNum2() {
        return additionalNum2;
    }

    public void setAdditionalNum2(int additionalNum2) {
        this.additionalNum2 = additionalNum2;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

}
