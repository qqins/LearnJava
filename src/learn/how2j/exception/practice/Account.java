package learn.how2j.exception.practice;

/**
 * Created by qqins on 2017/12/3 15:58
 */
public class Account {
    protected double balance = 0;

    public Account(double init) {
        this.balance += init;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amt) {
        this.balance += amt;
    }

    public void withdraw(double amt) throws OverdraftException {
        if (amt > this.balance)
            throw new OverdraftException("余额不足", amt - this.balance);
        else {
            this.balance -= amt;
        }
    }

    public static void main(String[] args) {
        Account a = new Account(1000);
        a.deposit(1000);
        System.out.println(a.getBalance());
        try {
            a.withdraw(3000);
            System.out.println(a.getBalance());
        }catch (OverdraftException e){
            System.out.println("透支金额:"+e.getDeficit());
            e.printStackTrace();
        }
    }
}
