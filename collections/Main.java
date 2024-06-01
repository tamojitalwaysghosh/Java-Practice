package collections;

import java.util.*;

public class Main{
    public static void main(String[] args){

        //--------------ArrayList-----------------
        System.out.println("--------------ArrayList-----------------");
        
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        System.out.println("At 0- "+list.get(0));

        list.add(12);
        System.out.println("At 1- "+list.get(1));

        System.out.println("Removed- "+list.remove(0));

        list.clear();//remove all

        //System.out.println(list.get(0)); -->would through error as list is empty

        //-------------------LinkedList--------------------
        System.out.println("--------------LinkedList-----------------");
        
        //You can also use add, get,remove in linkedlist, but is not preffered
        //use addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()
        LinkedList<Integer> link=new LinkedList<>();
        link.addFirst(1);
        link.addLast(3);
        System.out.println(link.getLast());


        //-----------HashMap-------------
        System.out.println("--------------HashMap-----------------");
        
        HashMap<Integer, String> map=new HashMap<>();

        map.put(1,"Tome");
        map.put(2,"Sam");
        map.put(3,"Rom");

        for(int i: map.keySet()){
            System.out.println("key: "+i+" | value: "+map.get(i));
        }

        // for(int i: map.valueSet()){
        //     System.out.println("value: "+i);
        // }

        System.out.println("size: "+map.size());
        
        System.out.println("removed key's value: "+map.remove(2));

        //System.out.println("contains?: "+map.contains(1));-->not valid
        
        System.out.println("size: "+map.size());

        //--------------HashSet----------------
        System.out.println("--------------HashSet-----------------");
        
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(0);
        set.add(1);
        set.add(3);

        for(int i: set){
            System.out.println("entry: "+i);
        }

        System.out.println("size: "+set.size());

        System.out.println("removed: "+set.remove(1));

        for(int i: set){
            System.out.println("entry: "+i);
        }


        System.out.println("contains?: "+set.contains(1));

        System.out.println("size: "+set.size());

        //---------------Stack-----------------
        System.out.println("--------------Stack-----------------");
        
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("top: "+st.peek());

        System.out.println("removed top: "+st.pop());

        System.out.println("isEmpty?: "+set.isEmpty());

        //----------------Queue------------------
        System.out.println("--------------Queue-----------------");
        
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.offer(2);//q.offer(val) ~ q.add(val) -->enqueue

        System.out.println("front: "+q.peek());

        System.out.println("removed val: "+q.poll()); ///q.poll() ~ q.remove() -->dequeue

        System.out.println("front: "+q.peek());

        System.out.println("isEmpty?: "+q.isEmpty());
    }
}