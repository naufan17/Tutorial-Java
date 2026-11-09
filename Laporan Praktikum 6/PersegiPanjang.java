class PersegiPanjang {
    private int pj;
    private int lb;
    private int luas;

    public void setPanjang(int panjang) {
        pj = panjang;
    }

    public void setLebar(int lebar) {
        lb = lebar;
    }

    public int getPanjang() {
        return pj;
    }

    public int getLebar() {
        return lb;
    }

    public int hitungLuas() {
        luas = pj * lb;
        return luas;
    }
}