package learn.how2j.class_learn;

/**
 * Created by qqins on 2017/12/2 21:13
 */
public class Cat extends Animal implements Pet {
    private String name;
    public Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat(){
        this("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println("猫吃啥");
    }

    @Override
    public void play() {
        System.out.println("猫玩啥");
    }

    public static void main(String[] args) {
        Animal a = new Cat("xx");
        a.eat();
        a.walk();
    }
}
