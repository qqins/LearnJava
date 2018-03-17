package learn.ch8;

/**
 * @author qqins
 */
public class TestDemo {
    public static void main(String[] args) {
        Message<Apple> m1 = new Message<>();
        m1.setMsg(new Apple());
        fun(m1);
    }

    public static void fun(Message<? extends Fruit> temp) {
        System.out.println(temp.getMsg());
    }
}

class Message<T> {
    private T msg;

    public void setMsg(T msg) {
        this.msg = msg;
    }

    public T getMsg() {
        return msg;
    }
}
class Fruit{

}
class Apple extends Fruit{

}