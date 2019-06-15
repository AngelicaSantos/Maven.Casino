package io.zipcoder.casino.roulette;

import io.zipcoder.casino.Gamble;
import io.zipcoder.casino.Player;
import io.zipcoder.casino.SpinGame;

public class Roulette extends SpinGame implements Gamble {

    private Chips chips;
    private Player player;
    private Boolean exit;


    // constructor
    public Roulette (Chips chips) {

        this.chips = chips;
    }
    // constructor
    public Roulette (Player player) {

        this.player = player;
    }


    public Integer getPlayerBalance() {

        return null;
    }


    public Integer spin() {

        return null;
    }


    public Integer playerBet () {

        return null;
    }



    public boolean continueGame() {

        return false;
    }


    public boolean clearchips() {

        return false;
    }









}
