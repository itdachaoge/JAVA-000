package com.geek.spring.homework.jdbc_dbpool.jdbc;

import java.sql.*;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
public class JdbcDemo {

    public static void main(String[] args) throws Exception {


        String url = "jdbc:mysql://localhost:3306/heima_eesy";
        String username = "root";
        String password = "root";
        Connection connection = JdbcDemo.getConnection(url, username, password);

        //查找
//        PreparedStatement pstm = connection.prepareStatement("select * from account");
//        ResultSet rs = pstm.executeQuery();
//        while (rs.next()) {
//            System.out.println(rs.getString("name"));
//        }
//        JdbcDemo.close(rs, pstm, connection);


        //修改
//        PreparedStatement pstm = connection.prepareStatement("update account set name=? where id= ?");
//        pstm.setString(1,"zhangycl");
//        pstm.setInt(2,1);
//        int result = pstm.executeUpdate();
//        System.out.println(result);
//        pstm.close();
//        connection.close();

        //增加
//        PreparedStatement pstm = connection.prepareStatement("insert into account(name,money) values(?,?)");
//        pstm.setString(1,"zhangycl");
//        pstm.setInt(2,1000);
//        int result = pstm.executeUpdate();
//        System.out.println(result);
//        pstm.close();
//        connection.close();


        //删除
        PreparedStatement pstm = connection.prepareStatement("delete from account where name = ? and money = ?");
        pstm.setString(1,"zhangycl");
        pstm.setInt(2,1000);
        int result = pstm.executeUpdate();
        System.out.println(result);
        pstm.close();
        connection.close();



    }


    public static Connection getConnection(String url, String username, String password) {

        Connection connection = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/heima_eesy","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void close(ResultSet rs, PreparedStatement pstm, Connection connection) {
        if (rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (pstm!=null) {
            try {
                pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
