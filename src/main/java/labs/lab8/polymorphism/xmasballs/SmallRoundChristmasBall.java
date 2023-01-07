package labs.lab8.polymorphism.xmasballs;

import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;

public class SmallRoundChristmasBall extends RoundChristmasBall {

    public SmallRoundChristmasBall(Color color, Pattern pattern) {
        super(color, pattern);
    }

    @Override
    public String toString() {
        return "SmallRoundChristmasBall{" + super.toString() + "}";
    }

}
