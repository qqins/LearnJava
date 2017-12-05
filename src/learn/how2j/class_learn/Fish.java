package learn.how2j.class_learn;

/**
 * Created by qqins on 2017/12/2 21:31
 */
public class Fish extends Animal implements Pet{
    private String name;
    public Fish(){
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("鱼没有腿");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("fish eat what");
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {

    }
}
