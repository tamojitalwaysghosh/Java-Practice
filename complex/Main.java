package complex;

class ComplexNumber{
    double real;
    double img;

    ComplexNumber(double real, double img){
        this.real=real;
        this.img=img;
    }

    public ComplexNumber add(ComplexNumber other){
        double val1=this.real+ other.real;
        double val2=this.img+ other.img;
        return new ComplexNumber(val1, val2);
    }

    public ComplexNumber diff(ComplexNumber other){
        double val1=this.real- other.real;
        double val2=this.img- other.img;
        return new ComplexNumber(val1, val2);
    }

    public ComplexNumber mul(ComplexNumber other){
        double val1=(this.real*other.real)-(this.img*other.img);
        double val2=(this.real*other.img)+(this.img*other.real);
        return new ComplexNumber(val1, val2);
    }

    // public ComplexNumber div(ComplexNumber other){
    //     int val1=this.real+ other.real;
    //     int val2=this.img+ other.img;
    //     return new ComplexNumber(val1, val2);
    // }

    public void printComplexNumber(){
        System.out.println("the number is: "+(int)this.real+((this.img<0)?"":"+")+(int)this.img+"i");
    }
}

public class Main{
    public static void main(String[] args){
        ComplexNumber c1= new ComplexNumber(6,11);
        ComplexNumber c2= new ComplexNumber(3,7);

        ComplexNumber sum= c1.add(c2);
        sum.printComplexNumber();

        ComplexNumber sub= c1.diff(c2);
        sub.printComplexNumber();
    }
}

// PS C:\Users\HP\OneDrive\Desktop\sql> javac complex/Main.java
// PS C:\Users\HP\OneDrive\Desktop\sql> java complex.Main      
// the number is: 9+11i
// the number is: 3-3i
// PS C:\Users\HP\OneDrive\Desktop\sql> javac complex/Main.java
// PS C:\Users\HP\OneDrive\Desktop\sql> java complex.Main      
// the number is: 9+18i
// the number is: 3+4i