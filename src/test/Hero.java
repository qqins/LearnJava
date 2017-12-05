package test;

import java.util.Date;

/**
 * Created by qqins on 2017/11/30 15:59
 */
public abstract class Hero {
    private int dmage;

    public Hero(int dmage) {
        this.dmage = dmage;
    }

    public abstract void attack();

    public static void main(String[] args) {
        int dmage = 10;
        Hero h = new Hero(dmage) {

            @Override
            public void attack() {
                System.out.println("hh" + dmage);
            }
        };
        h.attack();
    }
}
