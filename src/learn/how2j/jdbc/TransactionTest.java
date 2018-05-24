package learn.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: Hello World
 * @date: 2018/5/24 14:03
 * <p>
 * 事务实例
 */
public class TransactionTest {
    private static final String URL = "jdbc:mysql://120.79.200.250:3306/test?characterEncoding=UTF-8 & useSSL=true";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        String sql = "insert into hero values(null,?,?,?)";
        String sql1 = "update hero set hp=hp+1 where id=22";
        String sql2 = "updata hero set hp=hp-1 where id=22";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps1 = con.prepareStatement(sql1);
             PreparedStatement ps2 = con.prepareStatement(sql2)) {
            /*for (int i = 0; i < 20; i++) {
                ps.setString(1,"英雄");
                ps.setFloat(2,100);
                ps.setInt(3,99);
                ps.execute();
            }*/
            con.setAutoCommit(false);
            ps1.execute();
            ps2.execute();
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
