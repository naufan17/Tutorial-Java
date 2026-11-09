class SwitchDemo{
    public static void main(String[] args){
        int food = 1;
        
        switch(food) {
            case 1:
                System.out.println("Chicken");
            break;
            case 2:
                System.out.println("Pizza");
            break;
            default:
                System.out.println("Sorry, we are out");
        }
    }
}