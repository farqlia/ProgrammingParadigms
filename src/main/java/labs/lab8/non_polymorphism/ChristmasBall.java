package labs.lab8.non_polymorphism;

import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;
import labs.lab8.utils.Size;

public class ChristmasBall {

    private ChristmasBallType type;

    // round balls
    private Color color;
    private Size size;
    private Pattern pattern;

    // mushroom balls
    private Color hatColor;
    private Pattern hatPattern;
    private Color stemColor;

    // icicle balls
    private int height;
    private Color glassColor;

    public ChristmasBall(int height, Color glassColor) {
        this.height = height;
        this.glassColor = glassColor;
        this.type = ChristmasBallType.ICICLE;
    }

    public ChristmasBall(Color hatColor, Pattern hatPattern, Color stemColor) {
        this.hatColor = hatColor;
        this.hatPattern = hatPattern;
        this.stemColor = stemColor;
        this.type = ChristmasBallType.MUSHROOM;
    }

    public ChristmasBall(Color color, Pattern pattern,
                         Size size) {
        this.color = color;
        this.pattern = pattern;
        this.size = size;
        switch (size){
            case BIG -> this.type = ChristmasBallType.BIG_ROUND;
            case SMALL -> this.type = ChristmasBallType.SMALL_ROUND;
        }
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

    public Size getSize() {
        return size;
    }

    public Color getHatColor() {
        return hatColor;
    }

    public Pattern getHatPattern() {
        return hatPattern;
    }

    public Color getStemColor() {
        return stemColor;
    }

    // TODO : ???
    public int getHeight() {
        // ??
        return height;
    }

    public Color getGlassColor() {
        return glassColor;
    }
}
