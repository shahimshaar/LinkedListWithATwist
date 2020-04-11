package number7;

import number7.Main.next_customer;
import org.junit.Assert.assertEquals;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    void setUp(){

    }

    public boolean testList(LinkedList list){
        return assertEquals("first in", next_customer(list));
    }
    
    public void main(){
        LinkedList<String> newList = new LinkedList<String>();
        newList.addLast("first in");
        newList.addLast("second in");
        boolean result = testList(newList);
        System.out.println(result);
    }

   // @org.junit.jupiter.api.Test
   // void next_customer() {
   // }
}