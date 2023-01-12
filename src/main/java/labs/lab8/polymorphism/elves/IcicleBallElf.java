package labs.lab8.polymorphism.elves;

import labs.lab8.polymorphism.xmasballs.ChristmasBall;
import labs.lab8.polymorphism.xmasballs.IcicleChristmasBall;

public class IcicleBallElf extends Elf{

    IcicleChristmasBall[] balls;

    public IcicleBallElf(String name, int containerCapacity){
        super(name, containerCapacity);
        balls = new IcicleChristmasBall[containerCapacity];
    }


    @Override
    public boolean canTake(ChristmasBall ball) {
        return (ball instanceof IcicleChristmasBall);
    }

    @Override
    protected void _takeBall(ChristmasBall ball){
        balls[getNumberOfCollectedBalls()] = (IcicleChristmasBall) ball;
    }

}
