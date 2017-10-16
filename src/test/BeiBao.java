package test;

/**
 * Created by qqins on 2017/9/19 20:15
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 背包问题：
 * <p>
 * 有编号分别为a,b,c,d,e的五件物品，
 * 它们的重量分别是2,2,6,5,4，设 K(j)
 * 它们的价值分别是6,3,5,4,6，设 V(j)
 * 现在给你个承重为10的背包，
 * 如何让背包里装入的物品具有最大的价值总和？
 *
 * @author
 * @since 2017/9/1.
 */
public class BeiBao {
    private int[] K = {2, 2, 6, 5, 4};        //最大15
    private int[] V = {6, 3, 5, 4, 6};
    private int maxK = 10;
    private int[] d = new int[11];
    private Set[] state = new Set[11];            //主要用于保存物品的已经检索过的索引

    public static void main(String[] args) {
        BeiBao exam = new BeiBao();
        System.out.println(exam.resolve());
    }

    public BeiBao() {
        //初始化当前已经保存的状态数据, 初始化当前所有的价值为最小
        for (int index = 0; index <= 10; index++) {
            state[index] = new HashSet<Integer>();
            d[index] = 0;
        }
    }

    public int resolve() {
        for (int index = 0; index <= 10; index++) {
            int maxJ = 0;
            for (int j = 0; j < K.length; j++) {
                if (K[j] <= index) {
                    //这里需要过滤出当前已经放过的物品
                    // 因为物品是唯一的，放入以前的空间后，就不能再放了
                    int tem = (state[index - K[j]].contains(j)) ? 0 : V[j];
                    if (d[index] < tem + d[index - K[j]]) {
                        d[index] = d[index - K[j]] + tem;
                        maxJ = j;
                    }
                }
            }

            //每次执行完毕，则将其中以前放过的物品的索引，和当前最大的索引保存起来
            if (index >= K[maxJ]) {
                state[index].addAll(state[index - K[maxJ]]);
                state[index].add(maxJ);
            }
        }

        //输出其中的最大价值
        return d[maxK];
    }
}