package cmd_args;

public class Main{
    public static void main(String[] args){
        for(String arg: args){
            System.out.println("Argument: "+arg);
        }
    }
} 

//to give command-line arguments
//after compilation
//write:
//java ClassName "write everything here(separated by space)"

//eg: java cmd_args.Main arg1 arg2 arg3 arg4  arg5              arg7
//o|p: 
// Argument: arg1
// Argument: arg2
// Argument: arg3
// Argument: arg4
// Argument: arg5
// Argument: arg7