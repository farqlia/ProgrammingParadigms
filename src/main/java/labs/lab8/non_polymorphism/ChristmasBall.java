package labs.lab8.non_polymorphism;

import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;

public class ChristmasBall {

    private final Color color;
    private final Pattern pattern;
    private final ChristmasBallType type;


    public ChristmasBall(Color color, Pattern pattern,
                         ChristmasBallType type) {
        this.color = color;
        this.pattern = pattern;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public ChristmasBallType getType() {
        return type;
    }
}
