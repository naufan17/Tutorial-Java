package praktikum;

public class FlyableTest{
    public static void main(String[] args) {
        Flyable[] f = new Flyable[3];

        f[0] = new Burung();
        f[1] = new Capung();
        f[2] = new Pesawat();

        for (byte i = 0; i < f.length; i++) {
            f[i].fly();
        }
    }
}
