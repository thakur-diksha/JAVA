package abstractclasses;
abstract class Animal {
    
    static int legs;
    static String color;
    static String name;

    // abstract method
    public abstract void sound();
    public abstract void eating();

    // regular method
    public void displayInfo(String name, int legs, String color) {
        System.out.println("I am a " +name+ " ,i've "  +legs+  " legs, I'm " +color+ " in color");
    }
}

// subclass
class Dog extends Animal {
    
    @Override
    public void sound() {
        System.out.println("I woof");
    }
    @Override
    public void eating() {
        System.out.println("i'm a carnivore");
    }
}

class Spider extends Animal {
    
    @Override
    public void sound() {
        System.out.println("tak-tak");
    }
    @Override
    public void eating() {
        System.out.println("i'm a carnivore");
    }
}

class Chicken extends Animal {
    
    @Override
    public void sound() {
        System.out.println("kookdo koo");
    }
    @Override
    public void eating() {
        System.out.println("i'm a omnivore");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("meow");
    }
    @Override
    public void eating() {
        System.out.println("i'm a herbivore");
    }
}

class Wolf extends Animal {

    @Override
    public void sound() {
        System.out.println("howl");
    }
    @Override
    public void eating() {
        System.out.println("i'm a carnivore");
    }
}

class Cow extends Animal {

    @Override
    public void sound() {
        System.out.println("moo");
    }
    @Override
    public void eating() {
        System.out.println("i'm a herbivore");
    }
}

class Test {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayInfo(Animal.name="dog", Animal.legs=4, Animal.color="white");
        d.sound();
        d.eating();
        System.out.println(" ");
        
        Spider s = new Spider();
        s.displayInfo(Animal.name="spider", Animal.legs=6, Animal.color="grey");
        s.sound();
        s.eating();
        System.out.println(" ");
        
        Cat ca = new Cat();
        ca.displayInfo(Animal.name="cat", Animal.legs=4, Animal.color="black");
        ca.sound();
        ca.eating();
        System.out.println(" ");
        
        Chicken ch = new Chicken();
        ch.displayInfo(Animal.name="chicken", Animal.legs=2, Animal.color="white");
        ch.sound();
        ch.eating();
        System.out.println(" ");
        
        Wolf w = new Wolf();
        w.displayInfo(Animal.name="wolf", Animal.legs=4, Animal.color="brown");
        w.sound();
        w.eating();
        System.out.println(" ");
        
        Cow co = new Cow();
        co.displayInfo(Animal.name="cow", Animal.legs=4, Animal.color="black");
        co.sound();
        co.eating();
        
    }
}
/*
run:
I am a dog ,i've 4 legs, I'm white in color
I woof
i'm a carnivore
 
I am a spider ,i've 6 legs, I'm grey in color
tak-tak
i'm a carnivore
 
I am a cat ,i've 4 legs, I'm black in color
meow
i'm a herbivore
 
I am a chicken ,i've 2 legs, I'm white in color
kookdo koo
i'm a omnivore
 
I am a wolf ,i've 4 legs, I'm brown in color
howl
i'm a carnivore
 
I am a cow ,i've 4 legs, I'm black in color
moo
i'm a herbivore
BUILD SUCCESSFUL (total time: 0 seconds)
*/