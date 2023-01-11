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

    @Override
    public String toString() {
        return "MushroomChristmasBall{" +
                "hatColor=" + hatColor +
                ", hatPattern=" + hatPattern +
                ", stemColor=" + stemColor +
                '}';
    }
}
