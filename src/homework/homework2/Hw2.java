package homework.homework2;

/**
 * Created by qqins on 2017/11/19 17:35
 */
public class Hw2 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
        clock.tick();
        System.out.println(clock);
        in.close();
    }
}

class Clock {
    private Display hour;
    private Display minute;
    private Display seconds;

    public Clock(int hour, int minute, int seconds) {
        this.hour = new Display(hour, 24);
        this.minute = new Display(minute, 60);
        this.seconds = new Display(seconds, 60);
    }

    public void tick() {
        seconds.increase();
        if (seconds.getValue() == 0) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }

        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",
                hour.getValue(), minute.getValue(), seconds.getValue());
    }
}

class Display {
    private int value = 0;
    private int limit = 0;

    public Display(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public void increase() {
        value++;
        if (value == limit)
            value = 0;
    }

    public int getValue() {
        return value;
    }
}