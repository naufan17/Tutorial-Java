package praktikum;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("12345");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.insert(3, "aaa");
        System.out.println(sb);

        sb.append("zzz");
        System.out.println(sb);
    }
}