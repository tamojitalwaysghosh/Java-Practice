package abstracts;

abstract class Animal{
    public abstract void animalSound();

    public void sound(){
        System.out.println("woe");
    } 
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Hamba");
    }
}

interface Car{
    public void color();
    public void name();
}

class MyCar implements Car{
    public void color(){
        System.out.println("Red");
    }
    public void name(){
        System.out.println("Mushtang");
    }
}

interface Bike{
    public void brand();
}

class Vehicle extends MyCar implements Car,Bike{
    public void color(){
        System.out.println("Blue");
    }
    public void name(){
        System.out.println("Marcedez");
    } 
    public void brand(){
        System.out.println("Honda");
    }
}

public class Main{
    public static void main(String[] args){
        Pig pig=new Pig();
        pig.sound();
        pig.animalSound();

        MyCar c=new MyCar();
        c.color();
        c.name();

        Vehicle v=new Vehicle();
        v.color();
        v.name();
        v.brand();
    }
}