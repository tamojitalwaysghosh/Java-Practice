package poly;

class Animal{
    public void animalSound(){
        System.out.println("This is Animal");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("This is Pig");
    }
}

class Lion extends Animal{
    public void animalSound(){
        System.out.println("This is Lion");
    }
}

public class Main{
    public static void main(String[] args){
        Lion animal=new Animal();
        animal.animalSound();

        animal=new Pig();
        animal.animalSound();

        animal=new Lion();
        animal.animalSound();
    }
}