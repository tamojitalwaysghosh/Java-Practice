package mypackage;

import mypack.*;

public class Car extends Person{
    public static void main(String[] args){
        //This class can access the public attribute
        Person person=new Person();
        System.out.println(person.him);

        //In java, subclass(from different package) can access "protected" attribute 
        //but only iff we try to access it through the instance of the class of the current package
        Car car= new Car();
        car.setMyName("Rohan");
        System.out.println(car.getMyName());
        
        // Can't do this modifications on protected attributes w/o getter/setter
        // car.name="Yok";
        // System.out.println(car.name);
    }
}