package labs.lab8.polymorphism.elves;

import labs.lab8.polymorphism.xmasballs.BigRoundChristmasBall;
import labs.lab8.polymorphism.xmasballs.ChristmasBall;

public class BigRoundBallElf extends Elf{

    BigRoundChristmasBall[] balls;

    public BigRoundBallElf(String name, int containerCapacity){
        super(name, containerCapacity);
        balls = new BigRoundChristmasBall[containerCapacity];
    }

    @Override
    public boolean canTake(ChristmasBall ball) {
        return (ball instanceof BigRoundChristmasBall);
    }

    @Override
    protected void _takeBall(ChristmasBall ball){
        balls[getNumberOfCollectedBalls()] = (BigRoundChristmasBall) ball;
    }

}
