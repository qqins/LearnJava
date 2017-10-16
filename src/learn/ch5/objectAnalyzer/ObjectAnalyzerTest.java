package learn.ch5.objectAnalyzer;

import java.util.ArrayList;

/**
 * Created by qqins on 2017/10/12 14:42
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <=5 ; i++) {
            squares.add(i*i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
