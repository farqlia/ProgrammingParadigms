package labs.lab8.polymorphism.elves;

import labs.lab8.polymorphism.xmasballs.BigRoundChristmasBall;
import labs.lab8.polymorphism.xmasballs.ChristmasBall;
import labs.lab8.polymorphism.xmasballs.SmallRoundChristmasBall;

public class BigAndSmallRoundBallElf extends Elf{

    private final BigRoundChristmasBall[] bigRoundChristmasBalls;
    private final SmallRoundChristmasBall[] smallRoundChristmasBalls;

    private int bigRound;
    private int smallRound;

    public BigAndSmallRoundBallElf(String name, int bigRoundAmount, int smallRoundAmount) {
        super(name, bigRoundAmount + smallRoundAmount);
        this.bigRound = 0;
        this.smallRound = 0;
        bigRoundChristmasBalls = new BigRoundChristmasBall[bigRoundAmount];
        smallRoundChristmasBalls = new SmallRoundChristmasBall[smallRoundAmount];
    }


    @Override
    protected void _takeBall(ChristmasBall ball) {
        if (ball instanceof SmallRoundChristmasBall)
            smallRoundChristmasBalls[smallRound++] = (SmallRoundChristmasBall) ball;
        else if (ball instanceof BigRoundChristmasBall)
            bigRoundChristmasBalls[bigRound++] = (BigRoundChristmasBall) ball;
    }

    @Override
    public boolean canTake(ChristmasBall ball) {
        return (ball instanceof SmallRoundChristmasBall && smallRound < smallRoundChristmasBalls.length) ||
                (ball instanceof BigRoundChristmasBall && bigRound < bigRoundChristmasBalls.length);
    }
}
