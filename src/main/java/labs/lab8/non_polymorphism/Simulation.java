package labs.lab8.non_polymorphism;

import labs.lab8.utils.Color;
import labs.lab8.utils.Pattern;
import labs.lab8.utils.Size;

import java.util.List;
import java.util.Map;

public class Simulation {

    public static void m1(){

        Elf elf1 = new Elf("Elf 1", Map.of(ChristmasBallType.BIG_ROUND, 2));
        Elf elf2 = new Elf("Elf 2", Map.of(ChristmasBallType.ICICLE,3));
        Elf elf3 = new Elf("Elf 3", Map.of(ChristmasBallType.SMALL_ROUND,4));
        Elf elf4 = new Elf("Elf 4", Map.of(ChristmasBallType.MUSHROOM, 1));

        elf1.setNextElf(elf2);
        elf2.setNextElf(elf3);
        elf3.setNextElf(elf4);

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

        for (ChristmasBall ball : balls){
            elf1.takeOrSendFurther(ball);
        }

    }

    public static void modification(){

        Elf elf1 = new Elf("Elf 1", Map.of(ChristmasBallType.BIG_ROUND, 2));
        Elf elf2 = new Elf("Elf 2", Map.of(ChristmasBallType.SMALL_ROUND,2));
        Elf elf3 = new Elf("Elf 3", Map.of(ChristmasBallType.SMALL_ROUND,1,
                ChristmasBallType.BIG_ROUND,1));


        elf1.setNextElf(elf2);
        elf2.setNextElf(elf3);

        List<ChristmasBall> balls = List.of(
                new ChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS, Size.BIG),
                new ChristmasBall(Color.ORANGE, Pattern.PATTERNLESS, Size.BIG),

                new ChristmasBall(Color.BLACK, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(Color.WHITE, Pattern.PATTERNLESS, Size.SMALL),

                new ChristmasBall(Color.ORANGE, Pattern.PATTERNLESS, Size.BIG),
                new ChristmasBall(Color.BLACK, Pattern.PATTERNLESS, Size.SMALL)
        );

        for (ChristmasBall ball : balls){
            elf1.takeOrSendFurther(ball);
        }

    }

    public static void m3(){

        Elf elf1 = new Elf("Elf 1", Map.of(ChristmasBallType.BIG_ROUND, 1));
        Elf elf2 = new Elf("Elf 2", Map.of(ChristmasBallType.ICICLE,1));
        Elf elf3 = new Elf("Elf 3", Map.of(ChristmasBallType.SMALL_ROUND,1));
        Elf elf4 = new Elf("Elf 4", Map.of(ChristmasBallType.MUSHROOM, 1));
        Elf elf5 = new Elf("Elf 5", Map.of(ChristmasBallType.BIG_ROUND, 1));

        elf1.setNextElf(elf2);
        elf2.setNextElf(elf3);
        elf3.setNextElf(elf4);
        elf4.setNextElf(elf5);

        List<ChristmasBall> balls = List.of(
                new ChristmasBall(Color.TINTLESS, Pattern.PATTERNLESS, Size.BIG),
                new ChristmasBall(Color.RED, Pattern.SPOTTED, Size.BIG),
                new ChristmasBall(Color.GREEN, Pattern.PATTERNLESS, Color.WHITE),
                new ChristmasBall(Color.RED, Pattern.PATTERNLESS, Color.WHITE),
                new ChristmasBall(Color.BLACK, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(Color.WHITE, Pattern.PATTERNLESS, Size.SMALL),
                new ChristmasBall(2, Color.WHITE),
                new ChristmasBall(2, Color.GREEN)
        );

        for (ChristmasBall ball : balls){
            elf1.takeOrSendFurther(ball);
        }

    }

    public static void main(String[] args) {
        //m3();
        modification();
    }

}
