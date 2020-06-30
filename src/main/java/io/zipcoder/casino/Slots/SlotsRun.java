package io.zipcoder.casino.Slots;

import io.zipcoder.casino.Player;
import io.zipcoder.casino.Slots.SlotsMediator;
import io.zipcoder.casino.Slots.SlotsPlayer;

public class SlotsRun {

    private SlotsPlayer player;
            Integer myBet;

public void runSlots(Player iPlay) {
    SlotsPlayer myPlayer = new SlotsPlayer(iPlay);


    SlotsMediator slotMed = new SlotsMediator();
    slotMed.slotsMediator(myPlayer);

}



}
