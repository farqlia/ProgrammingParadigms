package labs.lab8.non_polymorphism;

public class Elf {

    enum ElfType {
        BIG_ROUND_XMAS_BALLS,
        SMALL_ROUND_XMAS_BALLS,
        MUSHROOM_XMAS_BALLS,
        ICICLE_XMAS_BALLS
    }

    private final String name;
    private final ChristmasBallType ballType;
    private final ChristmasBall[] balls;
    private int numberOfCollectedBalls;

    public Elf(String name, int containerSize, ElfType elfType) {

        switch (elfType){
            case BIG_ROUND_XMAS_BALLS -> this.ballType = ChristmasBallType.BIG_ROUND;
            case SMALL_ROUND_XMAS_BALLS -> this.ballType = ChristmasBallType.SMALL_ROUND;
            case MUSHROOM_XMAS_BALLS -> this.ballType = ChristmasBallType.MUSHROOM;
            default -> this.ballType = ChristmasBallType.ICICLE;
        }
        this.name = name;
        // max(1, containerSize)
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
