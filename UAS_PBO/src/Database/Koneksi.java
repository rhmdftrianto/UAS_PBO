package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
        
public class Koneksi {
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/pbo2";
    private final String USER = "root";
    private final String PASS = "";
    private Connection con;
    private Statement stmt;
    protected ResultSet rs;
    private String query;
    
    public Koneksi() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = con.createStatement();
    }
    
    public void setQuery(String sql){
        this.query = sql;
    }
    
    public String getQuery(){
        return this.query;
    }
    
    public void setClose() throws SQLException{
        this.stmt.close();
        con.close();
    }
    
    public void execute() throws SQLException {
        stmt.execute(this.query);
    }
    
    public void fetch() throws SQLException{
        this.rs = stmt.executeQuery(this.query);
    }
}
