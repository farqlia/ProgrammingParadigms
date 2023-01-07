package labs.lab8.polymorphism.simulation;

import labs.lab8.polymorphism.elves.*;
import labs.lab8.polymorphism.xmasballs.*;
import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;

import java.util.List;

public class Simulation {

    public static void main(String[] args) {

        List<Elf> elves = List.of(
                new BigRoundBallElf("Elf 1", 2),
                new IcicleBallElf("Elf 2", 3),
                new SmallRoundBallElf("Elf 3", 4),
                new MushroomBallElf("Elf 4", 1)
        );

        List<ChristmasBall> balls = List.of(
                new BigRoundChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS),
                new BigRoundChristmasBall(Color.RED, Pattern.SPOTTED),
                new MushroomChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Color.WHITE),
                new SmallRoundChristmasBall(Color.BLACK, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.WHITE, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.RED, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.GREEN, Pattern.PATTERNLESS),
                new IcicleChristmasBall(2, Color.WHITE),
                new IcicleChristmasBall(2, Color.GREEN),
                new IcicleChristmasBall(2, Color.TINTLESS)
        );

        System.out.println("Test 1");
        packBalls(elves, balls);

        elves = List.of(
                new BigRoundBallElf("Elf 1", 1),
                new IcicleBallElf("Elf 2", 1),
                new SmallRoundBallElf("Elf 3", 1),
                new MushroomBallElf("Elf 4", 1)
        );

        List<ChristmasBall> overPackedBalls = List.of(
                new BigRoundChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS),
                new BigRoundChristmasBall(Color.RED, Pattern.SPOTTED),
                new MushroomChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Color.WHITE),
                new MushroomChristmasBall(Color.RED, Pattern.PATTERNLESS, Color.WHITE),
                new SmallRoundChristmasBall(Color.BLACK, Pattern.PATTERNLESS),
                new SmallRoundChristmasBall(Color.WHITE, Pattern.PATTERNLESS),
                new IcicleChristmasBall(2, Color.WHITE),
                new IcicleChristmasBall(2, Color.GREEN)
        );

        System.out.println("\n\nTest 2");
        packBalls(elves, overPackedBalls);


    }

    public static void packBalls(List<Elf> elves,
                          List<ChristmasBall> balls){

        boolean wasTaken;
        for (ChristmasBall ball : balls){

            wasTaken = false;
            for (Elf elf : elves){
                if (wasTaken = (elf.takeBall(ball))) {
                    break;
                }
            }
            if (!wasTaken) System.out.println("Ups ball : " + ball + " is broken");

        }

    }

}
