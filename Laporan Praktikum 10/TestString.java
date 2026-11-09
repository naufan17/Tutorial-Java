package praktikum;

public class TestString {
    public static void main(String[] args) {
        String s1 = new String("UIN Sunan Kalijaga Yogyakarta");

        System.out.println(s1.charAt(10));
        System.out.println(s1.compareTo(new String("UIN Sunan Kalijaga")));
        System.out.println(s1.concat(" Indonesia"));

        char[] c = new char[] {'U', 'I', 'N'};

        System.out.println(String.copyValueOf(c));
        System.out.println(s1.endsWith("karta"));
        System.out.println(s1.equals("uin sunan kalijaga yogyakarta"));
        System.out.println(s1.equalsIgnoreCase("uin sunan kalijaga yogyakarta"));
        System.out.println(s1.indexOf("k"));
        System.out.println(s1.indexOf("k", 12));
        System.out.println(s1.length());
        System.out.println(s1.lastIndexOf("k"));
        System.out.println(s1.replace('y', 'j'));
        System.out.println(s1.split(" ")[0]);
        System.out.println(s1.startsWith("uin"));
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(10, 18));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(String.valueOf(5*10));
    }
}
