class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {

    public void area(int h, int b) {
        System.out.println(b * h);
    }
}

class Inheritance {
    public static void main(String args[]) {

        Triangle s1 = new Triangle();
        s1.area(2, 4);
        s1.area();
    }
}
