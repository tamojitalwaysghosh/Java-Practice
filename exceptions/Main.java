package exceptions;

import java.io.*;

class Checked{
    public void checkedExcp(String filePath){
        File file = new File(filePath);
        try{
            FileReader reader= new FileReader(file);
            
        }
        catch(IOException e){
            System.out.println("The error is: "+e.getMessage());
            //The error is: example.txt (The system cannot find the file specified)
        }
    }
}

class Unchecked{
    public void uncheckedExcp(int a, int b){
        try{
            int c=a/b;
            System.out.println("The value: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("The error is: "+e.getMessage()); 
            //The error is: / by zero
        }
    }
}

//throw exception explicitly
class ThrowNew{
    public void throwN(){
        try{
            //throw keyword is used to explicitly throw an exception
            //from a method or any block of code
            throw new ArithmeticException("This is life");
        }
        catch(ArithmeticException e){
            System.out.println("The error is: "+e.getMessage()); 
            //The error is: This is life
        }
    }
}

//--------------user-defined-------------

//---------checked
class CustomChecked extends Exception{
    public CustomChecked(){
        super();
    }

    public CustomChecked(String message){
        super(message);
    }
}

class CustomCThrow{
    public void throwExcp(){
        try{
            throw new CustomChecked("This is Custom Checked Exception");
        }
        catch(CustomChecked e){
            System.out.println("The error is: "+e.getMessage()); 
            //The error is: This is Custom Checked Exception
        }
    }
}

//---------unchecked
class CustomUnchecked extends RuntimeException{
    public CustomUnchecked(){
        super();
    }

    public CustomUnchecked(String message){
        super(message);
    }
}

class CustomUThrow{
    public void throwExcp(){
        try{
            throw new CustomUnchecked("This is Custom Unchecked");
        }
        catch(CustomUnchecked e){
            System.out.println("The error is: "+e.getMessage()); 
            //The error is: This is Custom Unchecked
        }
    }
}

//-----------Age Validation for Vote---------------

class AgeException extends RuntimeException{
    public AgeException(){
        super();
    }

    public AgeException(String message){
        super(message);
    }
}

class ThrowAgeExcp{
    public void checkAge(int age){
        try{
            if(age<18){
                throw new AgeException("You cannot Vote");
            }
            System.out.println("As you are "+age+" years old. So, you are eligible to vote."); 
        }
        catch(AgeException e){
            System.out.println("The error is: "+e.getMessage()); 
        }
    }
}

//-------------------------

public class Main{
    public static void main(String[] args){
        Checked c= new Checked();
        c.checkedExcp("example.txt");

        Unchecked u= new Unchecked();
        u.uncheckedExcp(10,0);

        ThrowNew t= new ThrowNew();
        t.throwN();

        CustomCThrow ct= new CustomCThrow();
        ct.throwExcp();

        CustomUThrow ut= new CustomUThrow();
        ut.throwExcp();

        //----Age Validation
        ThrowAgeExcp check= new ThrowAgeExcp();
        check.checkAge(22); 
    }
}