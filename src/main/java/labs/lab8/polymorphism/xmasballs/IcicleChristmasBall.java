package labs.lab8.polymorphism.xmasballs;

import labs.lab8.utils.Color;

public class IcicleChristmasBall extends ChristmasBall {

    private final int height;
    private final Color glassColor;

    public IcicleChristmasBall(int height, Color glassColor) {
        this.height = height;
        this.glassColor = glassColor;
    }

    public int getHeight() {
        return height;
    }

    public Color getGlassColor() {
        return glassColor;
    }

    @Override
    public String toString() {
        return "IcicleChristmasBall{" +
                "height=" + height +
                ", glassColor=" + glassColor +
                '}';
    }
}
