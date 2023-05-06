/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author Student
 */
public class LAB12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO student (studentID , firstname, lastname, email, deptID)"
                    + "values (?, ?, ?, ? , ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "111111");
            preparedStatement.setString(2, "AAAAAA");
            preparedStatement.setString(3, "BBBBBB");
            preparedStatement.setString(4, "XXX@gmail.com");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

