package com.pace.student1;


import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NADIYA
 * C:\Program Files\Java\jdk1.8.0_281\lib
 */
public class databaseConnection {
    private static Connection connection;
    public static Connection connection(){
        String JDBC_DRIVER;
        String DBURL,USER,PASSWORD; 
    JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    DBURL="jdbc:mysql://localhost:3306/nadiyadb";
    USER="root";
    PASSWORD="Nadiya@123";
        try{
            Class.forName(JDBC_DRIVER);
            connection=DriverManager.getConnection(DBURL,USER,PASSWORD);
            return connection;
        }
        catch(ClassNotFoundException| NullPointerException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        return null;
        }
    }
    
}
