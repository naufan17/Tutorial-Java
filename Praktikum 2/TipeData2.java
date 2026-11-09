class TipeData2 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        String str = "UNIVERSITAS GADJAH MADA";
        System.out.println("byte b = " +b);
        System.out.println("short s = " +s);
        System.out.println("int i = " +i);
        System.out.println("long l = " +l);
        System.out.println("char c = " +c);
        System.out.println("float f = " +f);
        System.out.println("double d = " +d);
        System.out.println("boolean bool = " +bool);
        System.out.println("str.charAt(1) = " +str.charAt(1));
        System.out.println("str.concat(\"Yogyakarta\") =" +str.concat("YOGYAKARTA"));
        System.out.println("str.length() = " +str.length());
        System.out.println("str.substring(0,11) = " +str.substring(0,11));
        System.out.println("str.substring(12) = " + str.substring(12));
        System.out.println("str.toUpperCase() = " +str.toUpperCase());
        System.out.println("str.toLowerCase() = " +str.toLowerCase());
        System.out.println("str.replace('A', 'O') = " +str.replace('A', 'O'));
        System.out.println("str.replaceAll(\"MADA\", \"MODO\") = "+str.replaceAll("MADA" , "MODO"));
    }
}