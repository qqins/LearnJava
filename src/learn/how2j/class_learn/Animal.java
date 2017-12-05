package learn.how2j.class_learn;

/**
 * Created by qqins on 2017/12/2 21:04
 */
public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("it walk use " + legs + " legs");
    }
}
