package number7;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static String next_customer(LinkedList<String> list){
        String next = list.getFirst();
        return next;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<String> nameList1 = new LinkedList<String>();
        LinkedList<String> nameList2 = new LinkedList<String>();
        LinkedList<String> nameList3 = new LinkedList<String>();
        LinkedList<String> nameList4 = new LinkedList<String>();
        LinkedList<String> nameList5 = new LinkedList<String>();
        //nameList1.addLast("Mo");
        nameList2.addLast("Jamima");
        nameList3.addLast("Lex");
        nameList4.addLast("Bruce");
        nameList5.addLast("Jesse");

        System.out.println("Please enter the number of items in your Cart: ");
        Integer num = in.nextInt();
        in.nextLine();
        if(num<=10 && num > 0){
            System.out.println("Please enter your name:");
            String name = in.nextLine();
            nameList1.addLast(name);
            Customer c1 = new Customer(name, num);
            System.out.println(c1.name + ", please proceed to line #1");
        }
        else if(num<=20 && num > 10){
            System.out.println("Please enter your name: ");
            String name = in.nextLine();
            nameList2.addLast(name);
            Customer c1 = new Customer(name, num);
            System.out.println(c1.name + ", please proceed to line #2");
        }
        else if(num<=30 && num > 20){
            System.out.println("Please enter your name: ");
            String name = in.nextLine();
            nameList3.addLast(name);
            Customer c1 = new Customer(name, num);
            System.out.println(c1.name + ", please proceed to line #3");
        }
        else if(num<=40 && num >30){
            System.out.println("Please enter your name: ");
            String name = in.nextLine();
            nameList4.addLast(name);
            Customer c1 = new Customer(name, num);
            System.out.println(c1.name + ", please proceed to line #4");
        }
        else{
            System.out.println("Please enter your name: ");
            String name = in.nextLine();
            nameList5.addLast(name);
            Customer c1 = new Customer(name, num);
            System.out.println(c1.name + ", please proceed to line #5");
        }
        System.out.println("Here are the names of the customers at the front of each line:");
        System.out.println("The first customer in line #1 is: "+next_customer(nameList1));
        System.out.println("The first customer in line #2 is: "+next_customer(nameList2));
        System.out.println("The first customer in line #3 is: "+next_customer(nameList3));
        System.out.println("The first customer in line #4 is: "+next_customer(nameList4));
        System.out.println("The first customer in line #5 is: "+next_customer(nameList5));

    }
}
