package service;

import java.util.ArrayList;

public class OrderNumber {
    ArrayList<Integer>numbers= new ArrayList<Integer>();
    int firstNumber=10000;
    int secondNumber=0;

    public OrderNumber() {
        numbers.add(firstNumber);

    }

    public  int generateOrderNumberArrayList() // this method must produce a number from 10000 to 90000
    {
//        for(int i= 0; i<=numbers.size();i++)
//        {
       // numbers.add(firstNumber);
        int araylistSize=numbers.size()-1;   // getting the size.
        int lastNumber=numbers.get(araylistSize); // getting the number at the last index.
        secondNumber=lastNumber+1;
        numbers.add(secondNumber);

        //}

        return secondNumber;
    }
}
