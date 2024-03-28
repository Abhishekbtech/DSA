// Abstraction :-   an abstract view, model or structure of a real life problem, and reduce its unnecessary details.

// 1. Abstract Class :- An abstract class must be declared with an abstract keyword.

// abstract class Animal {
//     abstract void walk();

//     void breathe() {
//         System.out.println("This animal breathes air");
//     }

//     Animal() {
//         System.out.println("You are about to create an Animal.");
//     }
// }

// class Horse extends Animal {
//     Horse() {
//         System.out.println("Wow, you have created a Horse!");
//     }

//     void walk() {
//         System.out.println("Horse walks on 4 legs");
//     }
// }

// class Chicken extends Animal {
//     Chicken() {
//         System.out.println("Wow, you have created a Chicken!");
//     }

//     void walk() {
//         System.out.println("Chicken walks on 2 legs");
//     }
// }

// public class Abstract {
//     public static void main(String args[]) {
//         Horse horse = new Horse();
//         horse.walk();
//         horse.breathe();
//     }
// }

// 2. Interfaces

interface Animal {
    void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class Abstract {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}
