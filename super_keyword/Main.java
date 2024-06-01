package super_keyword;

class Vehicle{

    Vehicle(){
        System.out.println("vehicle constructor");
    }

    int maxSpeed= 120;

    void message(){
        System.out.println("I am a vehicle");
    }
}

class Car extends Vehicle{

    Car(){
        //---------invoke super class constructor
        super();
        //if we do not include super() here,
        //output would be the same
        //because, java always includes super()
        //as the first statement in the constructor

        System.out.println("car constructor");
    }

    int maxSpeed= 200;

    void display(){
        System.out.println("This speed: "+maxSpeed);

        //---------invoke super class attribute
        System.out.println("SuperClass speed: "+super.maxSpeed);
    }

    void message(){
        System.out.println("I am a car");
    }

    void superMethod(){
        message();

        //---------invoke super class method
        super.message();
    }
}

//------------------------

class Box{
    double height, width, depth;

    Box(double h, double w, double d){
        height=h;
        width=w;
        depth=d;
    }
}

class MyBox extends Box{
    //sub-class/ inherited cannot access private attributes
    //it is only possible using super(incase of private)
    double n;
    MyBox(double h, double w, double d, double number){
        //the sub class constructor should have 
        //the parameters of the superclass
        //i.e, super-class has: h, w ,d
        //sub should have: h, w, d
        //sub can have more parameters 
        //but those 3 are must to have in sub
        super(h,w,d);
        n=number;
    }

    void display(double h){
        System.out.println("The value is: "+ (height+h));
    }
}
//------------------------

public class Main{
    public static void main(String[] args){
        Car c= new Car();
        c.display();

        c.superMethod();

        MyBox m= new MyBox(1,3,5,0);
        m.display(12);
    }
}

// o|p:
// vehicle constructor
// car constructor
// This speed: 200
// SuperClass speed: 120
// I am a car
// I am a vehicle