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

    /*** Creates Icicle Christmas Ball ***/
    public ChristmasBall(int height, Color glassColor) {
        this.height = height;
        this.glassColor = glassColor;
        this.type = ChristmasBallType.ICICLE;
    }

    /*** Creates Mushroom Christmas Ball ***/
    public ChristmasBall(Color hatColor, Pattern hatPattern, Color stemColor) {
        this.hatColor = hatColor;
        this.hatPattern = hatPattern;
        this.stemColor = stemColor;
        this.type = ChristmasBallType.MUSHROOM;
    }

    /*** Creates Round Christmas Ball ***/
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

    public ChristmasBallType getType() {
        return type;
    }

    @Override
    public String toString(){
        String ballDescription = "";
        switch (type){
            case ICICLE -> ballDescription = "height=" + height + ", glassColor=" + glassColor;
            case MUSHROOM -> ballDescription = "hatColor=" + hatColor + ", hatPattern=" + hatPattern + ", stemColor=" + stemColor;
            case BIG_ROUND, SMALL_ROUND -> ballDescription = "color=" + color + ", pattern=" + pattern + ", size=" + size;
        }
        return "ChristmasBall{type=" + type + ", " + ballDescription + "}";
    }

}
