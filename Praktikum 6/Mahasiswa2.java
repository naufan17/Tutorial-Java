class Mahasiswa2 {
    private String nim;
    private String nama;
    private String alamat;
    
    public Mahasiswa2() {
        this.nim = "N/A";
        this.nama = "noname";
        this.alamat = "unknown";
    }
    
    public void setNim(String pNim) {
        nim = pNim;
    }
    
    public void setNama(String pNama) {
        nama = pNama;
    }
    
    public void setAlamat(String pAlamat) {
        alamat = pAlamat;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
}