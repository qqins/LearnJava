package learn.how2j.jdbc;

import java.sql.*;

public class ListWork {
    public static void main(String[] args) {
        list(10, 6);
    }

    public static void list(int start, int count) {
        String url = "jdbc:mysql://localhost/how2j?characterEncoding=UTF-8 & useSSL=true & serverTimezone=UTC";
        String user = "root";
        String password = "123456";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement sta = con.createStatement()) {
            String sql = "select * from hero limit " + start + "," + count;
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float hp = rs.getFloat(3);
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d\n", id, name, hp, damage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
