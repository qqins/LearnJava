package learn.ch5.abstractClasses;

/**
 * Created by qqins on 2017/9/27 14:30
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
