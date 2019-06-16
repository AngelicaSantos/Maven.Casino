package io.zipcoder.casino.Slots;

import io.zipcoder.casino.GamblingPlayer;

import io.zipcoder.casino.Player;

import java.util.ArrayList;

public class SlotsPlayer extends Player implements GamblingPlayer {

    private Player player;
    static Integer myBet = 0;

    public SlotsPlayer(Player player){
        this.player = player;
    }

    public SlotsPlayer() {

    }

    @Override
    public Integer bet() {
  //      Integer myBet = 0;
        Integer ranNum = 0;
        Integer remain = 0;

        ranNum = (int) (99.0 * Math.random());

        remain = (ranNum % 3);

        if (remain == 2) {
            myBet = 5;
        }
        else if (remain == 1) {
            myBet = 3;
        }
        else {
            myBet = 1;
        }

        return myBet;
    }

}
