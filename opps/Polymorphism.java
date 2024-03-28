// Compile Time Polymorphism : Method Overloading 
// Method Overloading : Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality.

// class Student {
//     String name;
//     int age;

//     public void displayInfo(String name) {
//         System.out.println(name);
//     }

//     public void displayInfo(int age) {
//         System.out.println(age);
//     }

//     public void displayInfo(String name, int age) {
//         System.out.println(name);
//         System.out.println(age);
//     }

// }

// class Polymorphism {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.displayInfo("abhi");
//         s1.displayInfo(25);
//         s1.displayInfo("abhishek", 26);
//     }
// }

// 2. Runtime Polymorphism :- Runtime polymorphism is also known as dynamic
// polymorphism. overridden
// overridden :- parent and child classes both contain the same function with a
// different definition. The call to the function is determined at runtime is
// known as runtime polymorphism.

class Parent {
    void Print() {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {
    void Print() {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {
    void Print() {
        System.out.println("subclass2");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Parent a = new Parent();
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}