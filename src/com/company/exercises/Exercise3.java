package com.company.exercises;

import java.util.*;

public class Exercise3 {

    public static void ExOneMain (String[] args) {

    }

    public static List<Integer> getFinalData(List<Integer> data, List<List<Integer>> updates) {
        int aux = 0;
        int k = data.size();
        List<Integer> updatedData = new ArrayList<>(data);

        for (List<Integer> update : updates) {
            int i = update.get(0); // Get the i from the update
            int val = update.get(1); // Get the new val from the update

            if (i >= 0 && i < updatedData.size()) {
                updatedData.set(i, val);
            } else {
                System.out.println("Invalid index: " + i);
            }
        }


        return updatedData;
    }


}
