package labs.lab8.polymorphism.xmasballs;

import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;

public abstract class RoundChristmasBall extends ChristmasBall {

    private final Color color;
    private final Pattern pattern;

    public RoundChristmasBall(Color color,
                              Pattern pattern){
        this.color = color;
        this.pattern = pattern;
    }

    public Color getColor() {
        return color;
    }

    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "RoundChristmasBall{" +
                "color=" + color +
                ", pattern=" + pattern +
                '}';
    }
}
