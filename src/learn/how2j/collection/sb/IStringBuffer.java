package learn.how2j.collection.sb;

/**
 * @author qqins
 */
public interface IStringBuffer {
    void append(String str);

    void append(char c);

    void insert(int pos,String str);

    void insert(int pos,char c);

    void delete(int start);

    void delete(int start, int end);

    void reverse();

    int length();
}
