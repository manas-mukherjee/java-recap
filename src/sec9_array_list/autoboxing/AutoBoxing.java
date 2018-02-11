package sec9_array_list.autoboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        //Autoboxing
        for(int i=0; i<10; i++){
            intList.add(Integer.valueOf(i));
        }

        //Unboxing
        for(int i=0; i<10; i++){
            System.out.println(intList.get(i).intValue());
        }

        Integer ival = 56; // Integer.valueOf(56)
        int intVal = ival; // ival.intValue()
    }
}
