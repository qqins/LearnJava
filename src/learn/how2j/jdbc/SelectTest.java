package learn.how2j.jdbc;

import java.sql.*;

public class SelectTest {
    public static String url = "jdbc:mysql://120.79.200.250:3306/test?characterEncoding=UTF-8 & useSSL=true ";
    public static String user = "root";
    public static String password = "123456";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection con = DriverManager.getConnection
                (SelectTest.url, SelectTest.user, SelectTest.password);
             Statement sta = con.createStatement()) {
            /*String insert = "insert into hero values(null," + "'赵信" + 0 + "'" + "," + 666.0f + "," + 100 + ")";
            sta.execute(insert);*/
            /*String sql = "select * from hero";
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                *//**
                 * 可以使用字段名也可以使用字段顺序
                 *//*
                int id = rs.getInt("id");
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d\n", id, name, hp, damage);
            }*/
            /*String name = "dashen";
            String password = "thisispassword";
            String sql = "select * from user where name = '" + name + "' and password='" + password + "'";
            ResultSet rs = sta.executeQuery(sql);
            if (rs.next()) {
                System.out.println("正确");
            } else {
                System.out.println("错误");
            }*/

            String sql = "select count(*) from hero";
            ResultSet rs = sta.executeQuery(sql);
            rs.next();
            int total = rs.getInt(1);
            System.out.println(total);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
