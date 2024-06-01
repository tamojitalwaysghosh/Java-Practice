package constructor_chain;

//super() keyword is used to call constructor of the base class

class BaseClass{
    BaseClass(){
        System.out.println("Non-argumented BaseClass");
    }

    BaseClass(int x){
        System.out.println("Argumented BaseClass");
    }
}

public class UsingSuper extends BaseClass{
    UsingSuper(){
        System.out.println("Non-argumented SubClass");
    }

    UsingSuper(int x){
        super(5);//overriding the default super()
        System.out.println("argumented SubClass");
    }

    public static void main(String[] args){
        new UsingSuper();
        // Non-argumented BaseClass
        // Non-argumented SubClass

        new UsingSuper(5);
        // Argumented BaseClass
        // argumented SubClass
    }
}