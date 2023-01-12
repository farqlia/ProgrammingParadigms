package labs.lab8.polymorphism.simulation;

import labs.lab8.polymorphism.elves.*;
import labs.lab8.polymorphism.xmasballs.*;
import labs.lab8.polymorphism.xmasballs.ChristmasBall;
import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;

import java.util.List;

public class SImulation2 {

    public static void m1(){
        Elf elf1 = new BigRoundBallElf("Elf 1", 2);
        Elf elf2 = new IcicleBallElf("Elf 2", 3);
        Elf elf3 = new SmallRoundBallElf("Elf 3", 4);
        Elf elf4 = new MushroomBallElf("Elf 4", 1);

        elf1.setNextElf(elf2);
        elf2.setNextElf(elf3);
        elf3.setNextElf(elf4);

        List<ChristmasBall> balls = List.of(

                new BigRoundChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS),
                new BigRoundChristmasBall(Color.RED, Pattern.SPOTTED),
                new IcicleChristmasBall(2, Color.GREEN),
                new IcicleChristmasBall(2, Color.WHITE),
                new IcicleChristmasBall(2, Color.TINTLESS),
                new SmallRoundChristmasBall(Color.WHITE, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.RED, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.BLACK, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.GREEN, Pattern.PATTERNLESS),
                new MushroomChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Color.WHITE),

                // Nadmiarowe bombki
                new BigRoundChristmasBall(Color.BLACK, Pattern.SPOTTED),
                new IcicleChristmasBall(5, Color.TINTLESS),
                new SmallRoundChristmasBall(Color.ORANGE, Pattern.PATTERNLESS),
                new MushroomChristmasBall(Color.GREEN, Pattern.STRIPED, Color.WHITE)
        );

        for (ChristmasBall ball : balls){
            elf1.takeOrSendFurther(ball);
        }

    }

    public static void modification(){

        Elf elf1 = new BigRoundBallElf("Elf 1", 1);
        Elf elf2 = new SmallRoundBallElf("Elf 2", 1);
        Elf elf3 = new BigAndSmallRoundBallElf("Elf 3", 1, 1);

        elf1.setNextElf(elf2);
        elf2.setNextElf(elf3);

        List<ChristmasBall> balls = List.of(
                new BigRoundChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS),
                new BigRoundChristmasBall(Color.RED, Pattern.SPOTTED),
                new SmallRoundChristmasBall(Color.BLACK, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.WHITE, Pattern.PATTERNLESS)
        );

        for (ChristmasBall ball : balls){
            elf1.takeOrSendFurther(ball);
        }

    }


    public static void m3(){

        Elf elf1 = new BigRoundBallElf("Elf 1", 1);
        Elf elf2 = new IcicleBallElf("Elf 2", 1);
        Elf elf3 = new SmallRoundBallElf("Elf 3", 1);
        Elf elf4 = new MushroomBallElf("Elf 4", 1);
        Elf elf5 = new BigRoundBallElf("Elf 5", 1);

        elf1.setNextElf(elf2);
        elf2.setNextElf(elf3);
        elf3.setNextElf(elf4);
        elf4.setNextElf(elf5);

        List<ChristmasBall> balls = List.of(
                new BigRoundChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS),
                new BigRoundChristmasBall(Color.RED, Pattern.SPOTTED),
                new MushroomChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Color.WHITE),
                new MushroomChristmasBall(Color.RED, Pattern.PATTERNLESS, Color.WHITE),
                new SmallRoundChristmasBall(Color.BLACK, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.WHITE, Pattern.PATTERNLESS),
                new IcicleChristmasBall(2, Color.WHITE),
                new IcicleChristmasBall(2, Color.GREEN)
        );

        for (ChristmasBall ball : balls){
            elf1.takeOrSendFurther(ball);
        }

    }

    public static void main(String[] args) {
        //m1();
        modification();
        //m3();
    }

    //public static void packBalls(Elf firstElf, )

}
