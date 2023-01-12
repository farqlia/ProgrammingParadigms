package labs.lab8.polymorphism.elves;

import labs.lab8.polymorphism.xmasballs.ChristmasBall;

public abstract class Elf {

    private final String name;
    private final int containerCapacity;
    private int numberOfCollectedBalls;
    private Elf nextElf;

    public Elf(String name, int containerCapacity) {
        this.name = name;
        this.containerCapacity = containerCapacity;
        this.numberOfCollectedBalls = 0;
    }

    protected abstract void _takeBall(ChristmasBall ball);

    public abstract boolean canTake(ChristmasBall ball);

    private boolean takeBall(ChristmasBall ball){
        boolean canTakeBall = !isFull() && canTake(ball);
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

    public void takeOrSendFurther(ChristmasBall ball){
        if (takeBall(ball)) return;
        else if (nextElf != null) nextElf.takeOrSendFurther(ball);
        else System.out.println("Ups " + ball + " is broken");
    }

    public void setNextElf(Elf next){
        this.nextElf = next;
    }

}
