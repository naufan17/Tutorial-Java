class Mahasiswa3 {
    private String nim;
    private String nama;
    private String alamat;
    
    public Mahasiswa3() {
        this.nim = "N/A";
        this.nama = "noname";
        this.alamat = "unknown";
    }
    
    public Mahasiswa3(String nim) {
        this.nim = nim;
    }
    
    public Mahasiswa3(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public Mahasiswa3(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
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