package com.company.exercises;

import java.util.LinkedList;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("-----------------------------");
        Exercise2BinaryConversion.convertNumberToBinary(47);
        Exercise2BinaryConversion.convertNumberToBinary(2);
        Exercise2BinaryConversion.convertNumberToBinary(731);
        LinkedList<Integer> linkedList = Exercise2BinaryConversion.convertNumberToBinary(25);

        int num = 3;
        int j = 2;
        System.out.println("-----------------------------");
        System.out.println("Result:" + 32/13);
        System.out.println("Tamanho da lista: " + linkedList.size() + ", " + linkedList);
        System.out.println("Elemento na posicao: " + linkedList.size() + ", " + linkedList.get(linkedList.size() - 2));
        System.out.println("Elemento na posicao: 0" + linkedList.get(0));

        System.out.println("\n\n\n------------------ Decimal to Binary ------------------");
        System.out.println("Binário: " + Exercise2BinaryConversion.convertNumberToBinary(25) + " Decimal correspondente: " + Exercise2BinaryConversion.convertBinaryToDecimal(linkedList));
        LinkedList<Integer> linkedList2 = Exercise2BinaryConversion.convertNumberToBinary(90);
        System.out.println("Binário: " +  linkedList2 + " Decimal correspondente: " + Exercise2BinaryConversion.convertBinaryToDecimal(linkedList2));

        LinkedList<Integer> linkedTestList = new LinkedList<>();

        linkedTestList.add(1);
        linkedTestList.add(1);
        linkedTestList.add(1);
        linkedTestList.add(0);
        linkedTestList.add(1);
        linkedTestList.add(1);
        linkedTestList.add(0);
        linkedTestList.add(1);
        linkedTestList.add(0);
        linkedTestList.add(0);
        linkedTestList.add(1);
        linkedTestList.add(1);
        linkedTestList.add(0);
        linkedTestList.add(0);

        System.out.println("Binário: " +  linkedTestList + " Decimal correspondente: " + Exercise2BinaryConversion.convertBinaryToDecimal(linkedTestList));
    }
}
