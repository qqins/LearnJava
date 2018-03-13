package learn.how2j.collection.my_stack;

import learn.ch9.LinkedListTest;

import java.util.LinkedList;

public class MyStack implements Stack {
    LinkedList<String> linkedList = new LinkedList<>();

    @Override
    public void push(String str) {
        linkedList.addLast(str);
    }

    @Override
    public String pull() {
        return linkedList.removeLast();
    }

    @Override
    public String peek() {
        return linkedList.getLast();
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        for (int i = 0; i < 5; i++) {
            ms.push(String.valueOf(i));
        }
        System.out.println(ms.peek());
        System.out.println(ms.pull());
        System.out.println(ms.peek());
    }
}
