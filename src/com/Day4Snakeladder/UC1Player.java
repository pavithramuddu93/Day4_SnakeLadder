package com.Day4Snakeladder;

public class UC1Player {
    private String player_name;
    private int position;
    UC1Player(String player_name){
        this.player_name=player_name;
        this.position=0;
    }
    public String getPlayerName(){
        return player_name;
    }
    public int getPosition(){
        return position;
    }
    public void setPosition(int position){
        this.position=position;
    }
}
