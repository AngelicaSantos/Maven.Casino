package io.zipcoder.casino.Slots;
import org.junit.Assert;
import org.junit.Test;

public class ReelTest {



    @Test
   public void testslotsMediator() {

        SlotsMediator.slotsMediator(new SlotsPlayer());
    }


    @Test
    public void reelSpinTest() {
        String expected;
        String actual;
        Reel reel = new Reel();

        //      Given:
        expected = reel.getReelPlace(0);

        //      When
        reel.spin();
        actual = reel.getReelPlace(0);

        //      Then
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void reelArrayLength() {
        Integer expected;
        Integer actual;
        Reel reel = new Reel();

        //      Given:
        expected = 8;

        //      When
        actual = reel.getReelLength();

        //      Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reelArrayPlacesTest() {
         String expected;
         String actual;
         Reel reel = new Reel();

        //      Given:

            for (Integer i = 0; i < reel.getReelLength(); i++) {
                expected = Integer.toString(i);

        //      When
                reel.setReelPlace(i, expected);
                actual = reel.getReelPlace(i);

        //      Then
                Assert.assertEquals(expected, actual);
            }
    }

    @Test
    public void reelArrayPlaceValuesTest() {
        String expected;
        String actual;
        String[] place = { "   LEMON    ", "   CHERRY   ", "   SEVEN    ", "   PEACH    ",
                           "    CLUB    ", "   BANANA   ", "   TOMATO   ", "   GRAPE    "};
//,
//                "    PEAR    ", "   SPADE    ", " PINEAPPLE  ", "  COCONUT   ",
//                "   MANGO    ", "    BELL    ", "   PEPPER   ", "  DIAMOND   ",
//                "    KALE    ", " WATERMELON ", "    KIWI    ", "   APPLE    ",
//                "   CARROT   ", "   HEART    "};



        Reel reel = new Reel();

        //      Given:

        for (Integer i = 0; i < reel.getReelLength(); i++) {
            expected = place[i];

            //      When
            actual = reel.getReelPlace(i);


 //           System.out.println("Expected: " + expected + "      Actual: " + actual);


            //      Then
            Assert.assertEquals(expected, actual);
        }
    }



}
