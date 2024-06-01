package constructor_chain;

//this() keyword is used to call constructor of the current class

public class UsingThis{
    UsingThis(){
        this(5);
        System.out.println("Starting point, calling this(5)");
    }

    UsingThis(int x){
        //calling the caller(eg.: this()), would throw error
        this(5, 6);
        System.out.println("calling this(5, 6)");
    }

    UsingThis(int x, int y){
        System.out.println("Ending point");
    }

    public static void main(String[] args){
        new UsingThis(5);
        // Ending point
        // calling this(5, 6)

        new UsingThis();
        // Ending point
        // calling this(5, 6)
        // Starting point, calling this(5)
    } 
}