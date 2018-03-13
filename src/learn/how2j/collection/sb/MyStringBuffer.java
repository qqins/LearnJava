package learn.how2j.collection.sb;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

/**
 * @author qqins
 */
public class MyStringBuffer implements IStringBuffer {
    private ArrayList value;

    public MyStringBuffer() {
        value = new ArrayList();
    }

    public MyStringBuffer(String str) {
        this();
        if (str == null) {
            return;
        }
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            value.add(ch[i]);
        }
    }

    @Override
    public void append(char c) {
        insert(value.size(), c);
    }

    @Override
    public void append(String str) {
        insert(value.size(), str);
    }

    @Override
    public void insert(int pos, String str) {
        if (str == null) {
            return;
        }
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            insert(pos + i, ch[i]);
        }
    }

    @Override
    public void insert(int pos, char c) {
        if (pos < 0) {
            return;
        }
        if (pos > value.size()) {
            return;
        }
        value.add(pos, c);
    }

    @Override
    public void delete(int start) {
        /*if (start < 0 || start > value.size()) {
            return;
        }
        int length = value.size() - start + 1;
        for (int i = 0; i < length; i++) {
            value.remove(start - 1);
        }*/
        delete(start, value.size());
        value.remove(value.size() - 1);
    }

    @Override
    public void delete(int start, int end) {
        if (start < 0 || start > value.size()) {
            return;
        }
        if (end < 0 || end <= start || end > value.size()) {
            return;
        }
        for (int i = 0; i < end - start; i++) {
            value.remove(start - 1);
        }
    }

    @Override
    public void reverse() {
        for (int i = 0; i < value.size() / 2; i++) {
            char temp;
            temp = (char) value.get(i);
            value.set(i, value.get(value.size() - i - 1));
            value.set(value.size() - i - 1, temp);
        }
    }

    @Override
    public int length() {
        return value.size();
    }

    @Override
    public String toString() {
        char[] ch = new char[value.size()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) value.get(i);
        }
        return new String(ch);
//        return value.toString();
    }

    public static void main(String[] args) {
        MyStringBuffer sb = new MyStringBuffer("abcd");
        System.out.println(sb);
        sb.append('e');
        System.out.println(sb);
        sb.append("fgh");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.reverse();
        System.out.println(sb);
        sb.delete(4);
        System.out.println(sb);
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
