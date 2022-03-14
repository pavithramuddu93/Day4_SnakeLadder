package com.Day4Snakeladder;

public class UC2Dice {
    private int  size;
    UC2Dice(int size){
        this.size=size;
    }
    UC2Dice(){
        this(6);
    }
    public int getDiceSize(){
        return size;
    }
    public int getRoleDice(){
        return (int) ((Math.random() * (6*size - 1*(size-1)) + 1));
    }
}
