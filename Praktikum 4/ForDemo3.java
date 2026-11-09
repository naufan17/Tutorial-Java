class ForDemo3{
    public static void main(String[] args){
        int i, j;
        
        for (i = 10, j = 0; j < i; i--, j++) {
            System.out.print(i + " ");
            System.out.print(j + " ");
        }
    }
}