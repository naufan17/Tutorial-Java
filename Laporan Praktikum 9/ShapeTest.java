package praktikum;

class ShapeTest {
    public static void main(String argv[]) {
        Circle c = new Circle("Circle C");
        Square s = new Square("Square S");
        Triangle t = new Triangle("Triangle T");

        Shape shapeArray[] = {c, s, t};

        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println("The area of " + shapeArray[i].getName() + " is " + shapeArray[i].calculateArea() + " cm.\n");
        }
    }
}
