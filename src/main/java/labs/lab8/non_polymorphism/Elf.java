package labs.lab8.non_polymorphism;

public class Elf {

    private final String name;
    private final ChristmasBallType ballType;
    private final ChristmasBall[] balls;
    private int numberOfCollectedBalls;

    public Elf(String name, int containerSize, ChristmasBallType ballType) {
        this.name = name;
        this.ballType = ballType;
        this.balls = new ChristmasBall[containerSize];
        this.numberOfCollectedBalls = 0;
    }

    public boolean isCorrectType(ChristmasBall ball){
        return ball.getType() == ballType;
    }

    public boolean takeBall(ChristmasBall ball){
        boolean canTakeBall = !isFull() && isCorrectType(ball);
        if (canTakeBall){
            System.out.println(name + " takes " + ball);
            balls[numberOfCollectedBalls++] = ball;
            if (isFull()){
                System.out.println("The container of " + name + " is full");
            }
        }
        return canTakeBall;
    }

    public boolean isFull(){
        return numberOfCollectedBalls >= balls.length;
    }

}
