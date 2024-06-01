package exceptions;

public class ExcpChain{
    public static void main(String[] args){
        try{

            //the exception
            NumberFormatException ex= new NumberFormatException("This is Exception");

            //initialize cause of the exception
            ex.initCause(new ArithmeticException("This is the cause"));

            //throw the exception
            throw ex;
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());

            System.out.println(e.getCause());
            
        }
    }
}
// o|p: 
// This is Exception
// java.lang.ArithmeticException: This is the cause