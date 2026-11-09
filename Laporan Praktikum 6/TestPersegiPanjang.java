class TestPersegiPanjang {
    public static void main(String[] args) {

        PersegiPanjang p1 = new PersegiPanjang();
        PersegiPanjang p2 = new PersegiPanjang();

        p1.setPanjang(10);
        p1.setLebar(5);

        System.out.println("p1 panjangnya = " + p1.getPanjang());
        System.out.println("p1 lebarnya = " + p1.getLebar());
        System.out.println("Luas p1 adalah " + p1.hitungLuas());

        p2.setPanjang(7);
        p2.setLebar(3);

        System.out.println("p2 panjangnya = "+ p2.getPanjang());
        System.out.println("p2 lebarnya = "+ p2.getLebar());

        int luasP2 = p2.hitungLuas();

        System.out.println("Luas p2 adalah " + luasP2);
    }
}