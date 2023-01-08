package labs.lab8.non_polymorphism;

import java.util.List;

public class Simulation {

    public static void main(String[] args) {

        List<Elf> elves = List.of(
                new Elf("Elf 1", 2, Elf.ElfType.BIG_ROUND_XMAS_BALLS),
                new Elf("Elf 2", 3, Elf.ElfType.ICICLE_XMAS_BALLS),
                new Elf("Elf 3", 4, Elf.ElfType.SMALL_ROUND_XMAS_BALLS),
                new Elf("Elf 4", 1, Elf.ElfType.MUSHROOM_XMAS_BALLS)
        );



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
