package labs.lab8.polymorphism.xmasballs;

import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;

public class BigRoundChristmasBall extends RoundChristmasBall {

    public BigRoundChristmasBall(Color color, Pattern pattern) {
        super(color, pattern);
    }

    @Override
    public String toString() {
        return "BigRoundChristmasBall{" + super.toString() + "}";
    }
}
