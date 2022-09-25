package Array;

public interface pengguna {
    public void setNamaSiswa(String nama);

    void setNama(String namaPetugas);

    void setAlamat(String alamat);
    public void setTelepon(String telepon);
    public void setStatus(Boolean Status);

    public String getNamaSiswa(int id);

    String getNama(int idPetugas);

    public String getAlamat(int id);
    public String getTelepon(int id);
    public boolean getStatus(int id);
}
