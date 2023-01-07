package labs.lab8.polymorphism.elves;

import labs.lab8.polymorphism.xmasballs.ChristmasBall;
import labs.lab8.polymorphism.xmasballs.MushroomChristmasBall;

public class MushroomBallElf extends Elf{

    MushroomChristmasBall[] balls;

    public MushroomBallElf(String name, int containerCapacity){
        super(name, containerCapacity);
        balls = new MushroomChristmasBall[containerCapacity];
    }


    @Override
    public boolean isCorrectType(ChristmasBall ball) {
        return (ball instanceof MushroomChristmasBall);
    }

    @Override
    protected void _takeBall(ChristmasBall ball){
        balls[getNumberOfCollectedBalls()] = (MushroomChristmasBall) ball;
    }

}
