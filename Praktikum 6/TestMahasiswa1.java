class TestMahasiswa1 {
    public static void main(String[] args) {

        Mahasiswa1 mhs1 = new Mahasiswa1();
        Mahasiswa1 mhs2 = new Mahasiswa1();

        mhs1.setNim("01");
        mhs1.setNama("Ahmad");
        mhs1.setAlamat("Bantul");

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