package Database;
import java.sql.SQLException;

public class dataOrganisasi extends Koneksi implements CRUD{

    public static void insertAnggota(String n, String na, String dv, String jb) {
        throw new UnsupportedOperationException("Not supported yet."); 
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Constructor untuk Connect ke Database
    public dataOrganisasi() throws ClassNotFoundException, SQLException {
        super();
    }

    // Create
    @Override
    public void insertdataAnggota(String NIM, String NAMA, String DIVISI, String DEPARTEMEN){
        try {
        String sql = String.format ("INSERT INTO `himatol`(`NIM`, `NAMA`, `DIVISI`, `DEPARTEMEN`) VALUES ('%s','%s','%s','%s')", NIM,NAMA, DIVISI, DEPARTEMEN);
        this.setQuery(sql);
        this.execute();  
        } catch (Exception e) {
        }

    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM himatol";
        this.setQuery(sql);
        this.fetch();
    }
    
    // Update
    @Override
    public void updateAnggota (String NIM, String NAMA, String DIVISI, String DEPARTEMEN){
        try {
            String sql = String.format("UPDATE himatol SET NAMA = '%s', DIVISI ='%s', DEPARTEMEN ='%s' WHERE NIM = %s",
            NAMA, DIVISI, DEPARTEMEN, NIM);
            this.setQuery(sql);
            this.execute();
        } catch (Exception e) {
        }
        
    }

    // Delete
    @Override
    public void deleteAnggota(String NIM) {
        try {
            String sql = String.format("DELETE FROM himatol WHERE NIM = '%s'", NIM);
            this.setQuery(sql);
            this.execute();
        } catch (Exception e) {
        }
        
    }

    // Validation untuk mencegah redudansi data
    public boolean checkAnggota(String NAMA) throws SQLException {
        getAll();
        while (this.rs.next()) {
            if (this.rs.getString("himatol") == NAMA) {
                return false;
            }
        }
        return true;
    }

 
    public String[][] showAnggota() throws SQLException {
        String[][] data = new String[this.lenAnggota()][4];
        getAll();
        this.fetch();
        int i = 0;
        while (this.rs.next()) {
            data[i][0] = this.rs.getString("NIM");
            data[i][1] = this.rs.getString("NAMA");
            data[i][2] = this.rs.getString("DIVISI");
            data[i][3] = this.rs.getString("DEPARTEMEN");
            i++;
        }
        return data;
    }
    
    public int lenAnggota() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.rs.next()) {
            i++;
        }
        return i;
    }
}


