package load_vs_ride;

class MethodOverload{
    //method overloading exhibits static or early binding
    //because it is resolved at compile-time
    protected int add(int a, int b){
        return a+b;
    }

    protected int add(int a, int b, int c){
        return a+b+c;
    }

    protected double add(double a, double b){
        return a+b;
    }
}

class MethodOverride{
    public void myMethod(){
        System.out.println("This is the method");
    }
}

class SubClass extends MethodOverride{
    @Override
    public void myMethod(){
        System.out.println("This is the sub-method");
    }
}

public class Main{
    public static void main(String[] args){
        MethodOverload ol= new MethodOverload();
        System.out.println("The result 1 is: "+ol.add(1,2));
        System.out.println("The result 2 is: "+ol.add(1,2,3));
        System.out.println("The result 2 is: "+ol.add(1,2));

        MethodOverride or= new MethodOverride();
        or.myMethod();

        //when a reference variable of the super-class
        //is used to refer to a sub-class object
        //it is called "Upcasting"
        or=new SubClass();
        or.myMethod();
    }
}