class ForIfBreakOuterDemo{
    public static void main(String[] args){
        outer:
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (k == 3) break outer;
                System.out.println("j, k: " + j + ", " + k);
            }
        }
    }
}