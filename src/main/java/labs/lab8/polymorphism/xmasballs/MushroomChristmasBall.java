package labs.lab8.polymorphism.xmasballs;

import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;

public class MushroomChristmasBall extends ChristmasBall{

    private final Color hatColor;
    private final Pattern hatPattern;
    private final Color stemColor;

    public MushroomChristmasBall(Color hatColor, Pattern hatPattern, Color stemColor) {
        this.hatColor = hatColor;
        this.hatPattern = hatPattern;
        this.stemColor = stemColor;
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

    @Override
    public String toString() {
        return "ChristmasBallMushroom{" +
                "hatColor=" + hatColor +
                ", hatPattern=" + hatPattern +
                ", stemColor=" + stemColor +
                '}';
    }
}
