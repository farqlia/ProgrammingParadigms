package labs.lab8.non_polymorphism;

import java.util.HashMap;
import java.util.Map;

public class Elf {

    private final String name;
    private final ChristmasBall[] balls;
    private final Map<ChristmasBallType, Integer> ballTypesAndContainer;
    int numberOfCollectedBalls;
    private Elf nextElf;

    public Elf(String name, Map<ChristmasBallType, Integer> ballTypesAndContainer) {

        this.ballTypesAndContainer = new HashMap<>(ballTypesAndContainer);
        this.numberOfCollectedBalls = 0;
        this.name = name;
        this.balls = new ChristmasBall[ballTypesAndContainer.values().stream().reduce(Integer::sum).orElse(1)];
    }

    private boolean canTakeMoreOfType(ChristmasBallType type){
        return ballTypesAndContainer.getOrDefault(type, 0) > 0;
    }

    private boolean takeBall(ChristmasBall ball){
        boolean canTakeBall = canTakeMoreOfType(ball.getType()) && isCorrectType(ball);
        if (canTakeBall){
            System.out.println(name + " takes " + ball);
            ballTypesAndContainer.computeIfPresent(ball.getType(), (k, v) -> v - 1);
            balls[numberOfCollectedBalls++] = ball;
            if (isFull()){
                System.out.println("The container of " + name + " is full");
            }
        }
        return canTakeBall;
    }

    public boolean isCorrectType(ChristmasBall ball){
        return ballTypesAndContainer.containsKey(ball.getType());
    }

    public boolean isFull(){
        return numberOfCollectedBalls >= balls.length;
    }

    public void setNextElf(Elf next){
        this.nextElf = next;
    }

    public void takeOrSendFurther(ChristmasBall ball){
        if (takeBall(ball)) return;
        else if (nextElf != null) nextElf.takeOrSendFurther(ball);
        else System.out.println("Ups " + ball + " is broken");
    }



}
