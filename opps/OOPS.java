class Student {
    String name;
    int age;

    // // Student(String name, int age) {
    // // this.name = name;
    // // this.age = age;
    // // }

    Student() {
        System.out.println("hello abhi");
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void getInfo() {
        System.out.println("hello");
        // System.out.println(this.age);
    }
}

class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.age = 24;
        s1.getInfo();

        Student s2 = new Student(s1);
        s2.getInfo();
    }
}
