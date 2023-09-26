package com.company.exercises;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise2BinaryConversion {

    public static LinkedList convertNumberToBinary(Integer number) {
        LinkedList<Integer> binaryNumber = new LinkedList<>();

        for(int i = number; i > 0; i = i/2) {
            int aux = i%2;
            binaryNumber.add(aux);
        }
        Collections.reverse(binaryNumber);

        return binaryNumber;
    }

    public static Integer convertBinaryToDecimal(LinkedList<Integer> binaryNumber) {
        int index = binaryNumber.size()-1;
        int aux = 0;
        int numberCount = 0;

        while (index >= 0) {
            numberCount+= Math.pow(2, aux) * binaryNumber.get(index);
            aux++;
            index--;
        }

        return numberCount;
    }
}