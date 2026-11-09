package praktikum;

class Triangle extends Shape {
    private int width, height;

    Triangle(String aName) {
        super(aName);
        width = 3;
        height = 3;
    }

    public float calculateArea() {
        float area;
        area = (float) width * height / 2 ;
        return area;
    }
}
