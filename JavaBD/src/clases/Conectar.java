package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public final class Conectar {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";    
    private static final String pass = "1234";
    private static final String url = "jdbc:mysql://localhost:3306/smart_tmc";

    public Conectar() {
        conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if(conn != null)
            {
                System.out.println("Conexion establecida");
            }
        } catch (Exception e) {
            System.err.println("Error al conectar" + e);
        }
    }
    
    public Connection getConnection()
    {
        return conn;
    }
    
    public void Desconectar()
    {
        conn = null;
        
        if(conn == null)
        {
            System.out.println("Conexion terminada");
        }
    }
}
