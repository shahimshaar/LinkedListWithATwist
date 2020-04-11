package number7;

import java.util.Objects;

public class Customer {
    public String name;
    private int numOfCarts;

    public Customer(String name, Integer numOfCarts) {
        this.name = name;
        this.numOfCarts = numOfCarts;
    }

    public int getNumOfCarts() {
        return this.numOfCarts;
    }

    public String getName(){
        return this.name;
    }


}