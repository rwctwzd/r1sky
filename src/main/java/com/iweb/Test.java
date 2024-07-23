package com.iweb;

import com.iweb.dao.StudentDAO;
import com.iweb.dao.impl.StudentDAOImpl;
import com.iweb.pojo.Student;

import java.util.Date;

/**
 * JDBC java database connection
 *
 * @author lisiqi
 * @date 2024/7/22 14:48
 */
public class Test {
    public static void main(String[] args) {
//        // 驱动加载
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功!");
//        // 获取jdbc连接
//        String url = "jdbc:mysql://127.0.0.1:3306/nuist?characterEncoding=utf8";
//        String username = "root";
//        String password = "a12345";
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println("获取连接成功");
//        try {
//            Statement statement = connection.createStatement();
//            // 准备sql语句
//            String sql = "INSERT INTO stu\n" +
//                    "(NAME,gender,birthday,addr,qqnumber)\n" +
//                    "VALUES\n" +
//                    "('李思齐1','男','2003-09-20','湖南长沙',3124076825)";
//            String sql2 = "select * from stu limit 10";
//            // 运行sql 语句
//            statement.executeUpdate(sql);
//            // 驱动加载 连接获取 创建编译语句对象 执行语句
//            // 驱动加载 连接获取 创建编译语句对象 执行语句 获取查询结果集
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        Date d = new Date();
        Student s1 =    new Student(0,"李思齐","男",
                        d,"南京", 110L);
        StudentDAO studentDAO = new StudentDAOImpl();
//        studentDAO.insert(s1);
        Student s2 = new Student(6,"李齐","男",
                d,"湖南长沙", 120L);
        studentDAO.update(s2);

    }
}
