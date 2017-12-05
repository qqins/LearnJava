package learn.how2j;

/**
 * Created by qqins on 2017/11/30 16:24
 */
public abstract class Item {
    public abstract void disposable();

    public static void main(String[] args) {
        Item it=new Item() {
            @Override
            public void disposable() {
                System.out.println("Item");
            }
        };
        it.disposable();
    }
}
