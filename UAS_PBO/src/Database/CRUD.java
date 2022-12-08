package Database;

public interface CRUD {
    public abstract void insertdataAnggota(String NIM, String NAMA, String DIVISI, String DEPARTEMEN);
    public abstract void updateAnggota (String NIM, String NAMA, String DIVISI, String DEPARTEMEN);
    public abstract void deleteAnggota (String NIM);
}
