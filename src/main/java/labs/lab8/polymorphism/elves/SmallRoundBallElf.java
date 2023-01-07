package labs.lab8.polymorphism.elves;

import labs.lab8.polymorphism.xmasballs.ChristmasBall;
import labs.lab8.polymorphism.xmasballs.SmallRoundChristmasBall;

public class SmallRoundBallElf extends RoundBallElf{

    SmallRoundChristmasBall[] balls;

    public SmallRoundBallElf(String name, int containerCapacity){
        super(name, containerCapacity);
        balls = new SmallRoundChristmasBall[containerCapacity];
    }


    @Override
    public boolean isCorrectType(ChristmasBall ball) {
        return (ball instanceof SmallRoundChristmasBall);
    }

    @Override
    protected void _takeBall(ChristmasBall ball){
        balls[getNumberOfCollectedBalls()] = (SmallRoundChristmasBall) ball;
    }

}
