package labs.lab8.polymorphism.elves;

import labs.lab8.polymorphism.xmasballs.ChristmasBall;

public abstract class Elf {

    private final String name;
    private final int containerCapacity;
    private int numberOfCollectedBalls;

    public Elf(String name, int containerCapacity) {
        this.name = name;
        this.containerCapacity = containerCapacity;
        this.numberOfCollectedBalls = 0;
    }

    protected abstract void _takeBall(ChristmasBall ball);

    public abstract boolean isCorrectType(ChristmasBall ball);

    public boolean takeBall(ChristmasBall ball){
        boolean canTakeBall = !isFull() && isCorrectType(ball);
        if (canTakeBall){
            System.out.println(getName() + " takes " + ball);
            _takeBall(ball);
            numberOfCollectedBalls++;
            if (isFull()){
                System.out.println("The container of " + name + " is full");
            }
        }
        return canTakeBall;
    }

    public boolean isFull(){
        return numberOfCollectedBalls >= containerCapacity;
    }

    public int getNumberOfCollectedBalls() {
        return numberOfCollectedBalls;
    }

    public String getName() {
        return name;
    }
}
