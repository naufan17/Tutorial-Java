class ForDemo2{
    public static void main(String[] args){
        int x = 11;

        for (int j = 10; j >= 0; j = j-2 ){
            System.out.println("j is " + j);
            if (j > x)
                break;
        }
    }
}