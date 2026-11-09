class TestMahasiswa2 {
    public static void main(String[] args) {
    
        Mahasiswa2 mhs1 = new Mahasiswa2();
        Mahasiswa2 mhs2 = new Mahasiswa2();
        
        System.out.println("Nim dari mhs1 = " + mhs1.getNim());
        System.out.println("Nama dari mhs1 = " + mhs1.getNama());
        System.out.println("Alamat dari mhs1 = " + mhs1.getAlamat());

        mhs2.setNim("02");
        mhs2.setNama("Umar");
        mhs2.setAlamat("Sleman");

        System.out.println("Nim dari mhs2 = " + mhs2.getNim());
        System.out.println("Nama dari mhs2 = " + mhs2.getNama());
        System.out.println("Alamat dari mhs2 = " + mhs2.getAlamat());
    }
}