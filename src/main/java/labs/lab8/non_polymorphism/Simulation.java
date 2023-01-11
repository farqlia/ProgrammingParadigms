package labs.lab8.non_polymorphism;

import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;
import labs.lab8.utils.Size;

import java.util.List;

public class Simulation {

    public static void main(String[] args) {

        List<Elf> elves = List.of(
                new Elf("Elf 1", 2, Elf.ElfType.BIG_ROUND_XMAS_BALLS),
                new Elf("Elf 2", 3, Elf.ElfType.ICICLE_XMAS_BALLS),
                new Elf("Elf 3", 4, Elf.ElfType.SMALL_ROUND_XMAS_BALLS),
                new Elf("Elf 4", 1, Elf.ElfType.MUSHROOM_XMAS_BALLS)
        );

        List<ChristmasBall> balls = List.of(
                new ChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS, Size.BIG),
                new ChristmasBall(2, Color.WHITE),
                new ChristmasBall(Color.BLACK, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(Color.WHITE, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Color.WHITE),
                new ChristmasBall(2, Color.GREEN),
                new ChristmasBall(Color.RED, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(Color.RED, Pattern.SPOTTED, Size.BIG),
                new ChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(2, Color.TINTLESS),
                // nadmiarowe bombki
                new ChristmasBall(Color.ORANGE, Pattern.SPOTTED, Size.BIG),
                new ChristmasBall(Color.GREEN, Pattern.STRIPED, Color.WHITE),
                new ChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(4, Color.TINTLESS)
        );

        System.out.println("Test 1");
        packBalls(elves, balls);

        elves = List.of(
                new Elf("Elf 1", 1, Elf.ElfType.BIG_ROUND_XMAS_BALLS),
                new Elf("Elf 2", 1, Elf.ElfType.ICICLE_XMAS_BALLS),
                new Elf("Elf 3", 1, Elf.ElfType.SMALL_ROUND_XMAS_BALLS),
                new Elf("Elf 4", 1, Elf.ElfType.MUSHROOM_XMAS_BALLS),
                new Elf("Elf 5", 1, Elf.ElfType.BIG_ROUND_XMAS_BALLS)
        );

        balls = List.of(
                new ChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS, Size.BIG),
                new ChristmasBall(Color.RED, Pattern.SPOTTED, Size.BIG),
                new ChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Color.WHITE),
                new ChristmasBall(Color.RED, Pattern.PATTERNLESS, Color.WHITE),
                new ChristmasBall(Color.BLACK, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(Color.WHITE, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(2, Color.WHITE),
                new ChristmasBall(2, Color.GREEN)
        );

        System.out.println("\nTest 2");
        packBalls(elves, balls);

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
