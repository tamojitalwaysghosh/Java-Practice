package static_keyword;

public class Main{
    static int age=21;
    int eyes=2;

    void message(){
        //non-static methods can access the static members
        //but static methods cannot acccess non-static members
        System.out.println("My age is: "+age);

        age+=9;
        System.out.println("My age is: "+age);

        display(); //-->static methods can be accessed from anywhere 

    }

    static void display(){
        System.out.println("My age is: "+age);

        age+=9;
        System.out.println("My age is: "+age);

        //message();--> cannot make a static reference to the non-static method

    }

    public static void main(String[] args){
        display();

        Main m= new Main();
        m.message();
    }
}