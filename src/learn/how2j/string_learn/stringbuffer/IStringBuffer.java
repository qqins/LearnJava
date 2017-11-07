package learn.how2j.string_learn.stringbuffer;

/**
 * Created by qqins on 2017/11/3 16:04
 */
public interface IStringBuffer {
    public void append(String string);

    public void append(char c);

    public void insert(int pos, char b);

    public void insert(int pos, String b);

    public void delete(int start);

    public void delete(int start, int end);

    public void reverse();

    public int length();
}
