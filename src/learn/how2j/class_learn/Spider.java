package learn.how2j.class_learn;

/**
 * Created by qqins on 2017/12/2 21:08
 */
public class Spider extends Animal {
    public Spider(){
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("蜘蛛吃啥");
    }
}
