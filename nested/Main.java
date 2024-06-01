package nested;

class Outer{
    int x=10;

    class Inner{
        int y=5;
    }

    static class InnerClass{
        int z=3;
    }
}

public class Main{
    public static void main(String[] args){
        //access outer class
        Outer outer=new Outer();
        System.out.println(outer.x);

        //access inner class
        Outer.Inner inner =outer.new Inner();
        System.out.println(inner.y);

        //access inner static class
        Outer.InnerClass innerS =new Outer.InnerClass();
        System.out.println(innerS.z);
    }
}