package learn.how2j.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: Hello World
 * @date: 2018/5/24 14:39
 */
public class ORMTest {
    private static final String URL = "jdbc:mysql://120.79.200.250:3306/test?characterEncoding=UTF-8 & useSSL=true";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Hero get(int id) {
        Hero hero = new Hero(id);
        String sql = "select * from hero where id=?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                float hp = rs.getFloat("hp");
                int damage = rs.getInt("damage");
                hero.setName(name);
                hero.setHp(hp);
                hero.setDamage(damage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hero;
    }

    public static void add(Hero hero) {
        String sql = "insert into hero values(null,?,?,?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, hero.getName());
            ps.setFloat(2, hero.getHp());
            ps.setInt(3, hero.getDamage());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Hero hero) {
        String sql = "delete from hero where id=?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, hero.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Hero hero) {
        String sql = "update hero set name=?,hp=?,damage=? where id=?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, hero.getName());
            ps.setFloat(2, hero.getHp());
            ps.setInt(3, hero.getDamage());
            ps.setInt(4, hero.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Hero> list() {
        List<Hero> heroList = new ArrayList<>();
        String sql = "select * from hero";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            int id = 0;
            String name = "";
            float hp = 0;
            int damage = 0;
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                hp = rs.getFloat("hp");
                damage = rs.getInt("damage");
                Hero hero = new Hero(id);
                hero.setName(name);
                hero.setHp(hp);
                hero.setDamage(damage);
                heroList.add(hero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return heroList;
    }

    public static void main(String[] args) {
        Hero hero = get(4);
        System.out.println(hero.toString());
        Hero hero1=new Hero();
        hero1.setName("test");
        hero1.setHp(666);
        hero1.setDamage(888);
        add(hero1);
        Hero hero2 = new Hero(6);
        hero2.setName("机器人");
        hero2.setHp(123);
        hero2.setDamage(234);
        update(hero2);
        delete(new Hero(47));
        List<Hero> list=list();
        System.out.println(list.size());
    }
}

class Hero {
    private int id;
    private String name;
    private float hp;
    private int damage;

    public Hero() {

    }
    public Hero(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + hp + ", " + damage + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hp, damage);
    }
}