package nested;

class A{
    public interface NestedF{
        public Boolean isNegative(int x);
    }
}

class B implements A.NestedF{
    public Boolean isNegative(int x){
        return (x>0)?false:true;
    }
}

public class InterF{
    public static void main(String[] args){
        // A.NestedF n=new B(); -->also holds true
        B n=new B();
        System.out.println(n.isNegative(10));
    }
}