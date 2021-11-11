package config;

import java.sql.*;

public class BasedeDatos {
    public String driver = "com.mysql.jdbc.Driver";
    public Connection getConection(){
        Connection conexion=null;
        try{
            conexion = DriverManager.getConnection("jdbc:mysql//localhost:3306/comision1109");
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return conexion;
    } 
    public static void main(String [] argms){
        
        System.out.println("hola");
    }
}
