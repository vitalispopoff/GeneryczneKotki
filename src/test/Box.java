package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Box</*S,*/ T extends Pawable<T>> {

//    private HashMap<S, T> theBox;
    private ArrayList<T> theBox = new ArrayList<>();
    

    public void putInTheBox(T animal) {
        theBox.add(animal);

    }
    
    public T takeFromTheBox(){
        int glimpseOfLuck = new Random().nextInt(theBox.size());
        T inHand = theBox.get(glimpseOfLuck);
        theBox.remove(glimpseOfLuck);
        System.out.println(inHand.toString());
        return inHand;
        
    }

    public void whatsInBox(){
        for (T pup: theBox
             ) {
            System.out.print(pup.toString()+", ");
        }
    }

/*    public void takeFromTheBox() {
        String idCache = ((String[]) theBox.keySet().toArray())[new Random().nextInt(theBox.size())];
        System.out.println(theBox.get(idCache).toString());
        theBox.remove(idCache);
    }*/
}
