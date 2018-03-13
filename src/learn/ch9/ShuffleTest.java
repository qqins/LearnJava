package learn.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author qqins
 */
public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        System.out.println(numbers);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
