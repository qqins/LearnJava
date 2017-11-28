package homework.homework2;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by qqins on 2017/11/25 20:14
 */
public class Hw3 {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
//        ArrayList<Integer> distance = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            String s = in.next();
            if (s.equals("###")) {
                break;
            } else {
                city.add(s);
            }

        }
//        System.out.println(city.size());
        int[][] distance = new int[city.size()][city.size()];
        for (int i = 0; i < city.size(); i++) {
            for (int j = 0; j < city.size(); j++) {
                distance[i][j] = in.nextInt();
            }
        }
        String c1 = in.next();
        String c2 = in.next();

        HashMap<String, Integer>[] h = new HashMap[city.size()];

        for (int i = 0; i < city.size(); i++) {
            h[i] = new HashMap<String, Integer>();
            for (int j = 0; j < city.size(); j++) {
                h[i].put(city.get(j), distance[i][j]);
            }
        }
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < city.size(); i++) {
            if (c1.equals(city.get(i)))
                n1 = i;
            if (c2.equals(city.get(i)))
                n2 = i;
        }
        System.out.println(h[n1].get(city.get(n2)));
    }
}
