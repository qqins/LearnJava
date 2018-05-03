package learn.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection c = DriverManager.getConnection("jdbc:mysql://120.79.200.250:3306" +
                        "/test?characterEncoding=UTF-8 & useSSL=true & serverTimezone=UTC",
                "root", "123456");
             Statement s = c.createStatement()) {
            /*for (int i = 11; i < 101; i++) {
                String sql = "delete from hero where id=" + i;
                s.execute(sql);
            }*/
            String sql = "update hero set name ='武器大师' where id=2";
            String sql1 = "update hero set name ='剑圣' where id=3";
            s.execute(sql);
            s.execute(sql1);
            System.out.println("连接成功" + s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
