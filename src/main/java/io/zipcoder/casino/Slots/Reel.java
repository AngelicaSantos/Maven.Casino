package io.zipcoder.casino.Slots;

import java.util.Random;

public class Reel {

    private String[] place = { "   LEMON    ", "   CHERRY   ", "   SEVEN    ", "   PEACH    ",
            "    CLUB    ", "   BANANA   ", "   TOMATO   ", "   GRAPE    "};
//                                "    PEAR    ", "   SPADE    ", " PINEAPPLE  ", "  COCONUT   ",
//                                "   MANGO    ", "    BELL    ", "   PEPPER   ", "  DIAMOND   ",
//                                "    KALE    ", " WATERMELON ", "    KIWI    ", "   APPLE    ",
//                                "   CARROT   ", "   HEART    "};


        public void setReelPlace(Integer i, String value) {
            place[i] = value;
        }

        public String getReelPlace(Integer i) {
            return place[i];
    }

        public Integer getReelLength() {
        return place.length;
    }

        public void spin() {
            String[] tmp = new String[place.length];
            Random rnd = new Random();

            int iPlace = (int) ((place.length * place.length + 1) * rnd.nextFloat());  //  add starting pointer
            iPlace = (iPlace % place.length);

            for (Integer i = 0; i < place.length; i++) {
                tmp[i] = place[iPlace];
                iPlace ++;
                if (iPlace >= place.length) {
                        iPlace = 0;
                }
            }

            place = tmp;

        }
}
