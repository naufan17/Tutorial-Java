class TestMahasiswa3 {
    public static void main(String[] args) {

        Mahasiswa3 mhs1 = new Mahasiswa3();
        Mahasiswa3 mhs2 = new Mahasiswa3("01");
        Mahasiswa3 mhs3 = new Mahasiswa3("02", "Budi");
        Mahasiswa3 mhs4 = new Mahasiswa3("03", "Abdul", "Sleman");

        System.out.println("Nim dari mhs1 = " + mhs1.getNim());
        System.out.println("Nama dari mhs1 = "  + mhs1.getNama());
        System.out.println("Alamat dari mhs1 = " + mhs1.getAlamat());
        System.out.println("Nim dari mhs2 = " + mhs2.getNim());
        System.out.println("Nama dari mhs2 = " + mhs2.getNama());
        System.out.println("Alamat dari mhs2 = " + mhs2.getAlamat());
        System.out.println("Nim dari mhs3 = " + mhs3.getNim());
        System.out.println("Nama dari mhs3 = " + mhs3.getNama());
        System.out.println("Alamat dari mhs3 = " + mhs3.getAlamat());
        System.out.println("Nim dari mhs4 = " + mhs4.getNim());
        System.out.println("Nama dari mhs4 = " + mhs4.getNama());
        System.out.println("Alamat dari mhs4 = " + mhs4.getAlamat());
    }
}