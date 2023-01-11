package lectures.lecture10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1.2);

        List<Integer> ints = new ArrayList<>();

        copy(nums, ints);

        // Arrays are covariant
        Integer[] arrInt = {1, 2};
        Number[] arrNum = arrInt;

        // Hence they cause issues
        arrNum[0] = 3.14;

    }

    // ? super T : contravariance
    // ? extends T : covariance
    public static <T> void copy(List<? super T> dest,
                                List<? extends T> src){
        for (int i = 0; i < src.size(); i++){
            dest.set(i, src.get(i));
        }
    }

}
