package learn.how2j.jdbc;

import java.sql.*;

public class TestJdbc {
    private String url = "jdbc:mysql://120.79.200.250:3306/test?characterEncoding=UTF-8 & useSSL=true ";
    private String user = "root";
    private String password = "123456";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        TestJdbc tj = new TestJdbc();
//        tj.preparedStatement();
        tj.comparePreAndSta();
    }

    public void test() {
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

    public void preparedStatement() {
        String sql = "insert into hero values(null,?,?,?)";
        String sql1 = "select * from hero where name = ?";
        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = con.prepareStatement(sql1);
             Statement s = con.createStatement()) {
            /*ps.setString(1,"赵信");
            ps.setFloat(2,400.0f);
            ps.setInt(3,99);
            ps.execute();*/

            /*for (int i = 0; i < 10; i++) {
                ps.setString(1, "英雄" + i);
                ps.setFloat(2, 100.0f);
                ps.setInt(3, 10);
                ps.execute();
            }*/

            String name = "'盖伦' or 1=1";
           /* ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                String hname = rs.getString("name");
                System.out.println(hname);
            }*/

            String sql2 = "select * from hero where name = " + name;
            ResultSet rs = s.executeQuery(sql2);
            while (rs.next()) {
                String hname = rs.getString("name");
                System.out.println(hname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void comparePreAndSta() {
        String sql = "insert into hero values(null,?,?,?)";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement s = con.createStatement();
             PreparedStatement ps = con.prepareStatement(sql)) {
            long start1 = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
                String sql1 = "insert into hero values(null," + "'英" + i + "'" + "," + i + "," + i + ")";
                s.execute(sql1);
            }
            long end1 = System.currentTimeMillis();
            System.out.printf("采用statement：%d", end1 - start1);
            System.out.println();

            long start2 = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
                ps.setString(1, "雄");
                ps.setFloat(2, 666.0f);
                ps.setInt(3, 100);
                ps.execute();
            }
            long end2 = System.currentTimeMillis();
            System.out.printf("采用prepare：%d", end2 - start2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
