package io.zipcoder.casino.roulette;

public class RoulettePanel {

    private final Color color;

    private final Integer integer;

public RoulettePanel(Color color, Integer integer) {
    this.color=color;
    this.integer=integer;
}

    public Color getColor() {
        return color;
    }

    public Integer getInteger() {
    return integer;
    }
}
