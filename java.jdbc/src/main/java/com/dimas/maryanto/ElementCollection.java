package com.dimas.maryanto;

import java.util.*;

public class ElementCollection {

    private static List<String> valuesList = new ArrayList<String>();

    private static Map<Integer, String> valuesMap = new HashMap<Integer, String>();

    private static Set<String> valuesSet = new HashSet<String>();

    public static void main(String[] args) {
        setNilaiList();
//        setNilaiMap();
//        setNilaiSet();
    }

    public static void setNilaiMap() {
        valuesMap.put(1, "Dimas");
        valuesMap.put(2, "Syarif");
        valuesMap.put(3, "Lery");

        String nilai = valuesMap.get(1);
        for (String value : valuesMap.values()) {
            System.out.println(value);
        }


        for (Integer key : valuesMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void setNilaiList() {
        valuesList.add("Dimas");
        valuesList.add("Dimas");
        valuesList.add("Syarif");
        valuesList.add("Lery");

        for (String value : valuesList) {
            System.out.println(value);
        }
    }

    public static void setNilaiSet() {
        valuesSet.add("Dimas");
        valuesSet.add("Syarif");
        valuesSet.add("Lery");
        valuesSet.add("Dimas");

        for (String value : valuesSet) {
            System.out.println(value);
        }
    }
}
