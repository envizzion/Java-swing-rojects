package book;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
  public static Connection getconneConnection()throws Exception{
      Class.forName("com.mysql.jdbc.Driver");
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
      return c;
  }  
}
//public class Db {
//
//    static Connection c;
//
//    public static Connection getConnection() throws Exception {
//        if (c == null) {
//            Class.forName("com.mysql.jdbc.Driver");
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "Hasini");
//        }
//        return c;
//    }

   

