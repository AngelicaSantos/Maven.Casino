package io.zipcoder.casino.roulette;

import io.zipcoder.casino.GamblingPlayer;
import io.zipcoder.casino.Player;
import io.zipcoder.casino.utilities.Console;


public class RoulettePlayer implements GamblingPlayer {

    private Player player;
    private Console console;


    public RoulettePlayer(Player player) {
        this.player = player;
    }

    public String getPlayerName() {
        return player.getName();
    }

    public Integer getWalletBalance() {
        return player.getMoney();
    }

    @Override
    public Integer bet() {
        String wantToBet = "How much would you like to bet?";
        Integer betAmount = console.getIntegerInput(wantToBet);
        Integer newWallet = player.getMoney() - betAmount;
        player.setMoney(newWallet);
        return betAmount;

    }

    public Integer bet(Integer amount) {
        Integer newWallet = player.getMoney() - amount;
        player.setMoney(newWallet);
        return player.getMoney();
    }

    public Integer addToWallet(Integer amount) {
        Integer newWallet = player.getMoney() + amount;
        player.setMoney(newWallet);
        return player.getMoney();


    }

    public void setAccount(String num) {
    }

    public String getAccount() {
        return null;
    }

    public void setAccount(double num) {
    }
}

