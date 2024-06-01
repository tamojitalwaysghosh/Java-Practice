package mypack;

public class Person{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    protected String my_name;

    protected void setMyName(String name){
        this.my_name = name;
    }

    protected String getMyName(){
        return my_name;
    }

    public String him="Tamo";

    public static void main(String[] args){
        //protected attributes can be accessed without any getter/setter in the same class 
        //getter/setter is only needed when we move to a different class/package
        Person person=new Person();
        person.name="Tam0";
        System.out.println(person.name);
        person.setName("John");
        System.out.println(person.getName());
        person.setMyName("Tom");
        System.out.println(person.getMyName());
    }
}

