package learn.ch5.abstractClasses;

/**
 * Created by qqins on 2017/9/27 15:12
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in" + major;
    }
}
