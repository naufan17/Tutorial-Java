package praktikum;

abstract class Shape {
    private String name;

    Shape(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public float calculateArea() {
        return 0.0f;
    }
}
