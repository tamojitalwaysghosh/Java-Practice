package enumss;

public class Main{
    enum Level{
        HIGH,
        MEDIUM,
        LOW
    }

    public static void main(String[] args){
        Level myVar= Level.MEDIUM;

        System.out.println(myVar);

        //switch case enum
        switch(myVar){
            case LOW: 
                System.out.println("low level");
                break;
            
            case MEDIUM:
                System.out.println("medium level");
                break;
            
            case HIGH:
                System.out.println("high level");
                break;
        }

        //loop through enum
        for(Level l: Level.values()){
            System.out.println(l);
        }
    }
}