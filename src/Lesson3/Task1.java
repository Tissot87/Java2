package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        HashMap<String, Integer> wards = new HashMap<>();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Кухня");
        arrayList.add("Столовая");
        arrayList.add("Кухня");
        arrayList.add("Коридор");
        arrayList.add("Ванная");
        arrayList.add("Гостинная");
        arrayList.add("Столовая");
        arrayList.add("Спальня");
        arrayList.add("Кухня");
        arrayList.add("Гостинная");

        System.out.println("Полный список " + arrayList);

        for (int i = 0; i < arrayList.size(); i++) {

            String wardChar = arrayList.get(i);

            if (!wards.containsKey(wardChar)) {
                wards.put(wardChar, 1);
            } else {
                wards.put(wardChar, wards.get(wardChar) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wards.entrySet()) {
            System.out.println("Слово = " + entry.getKey() + ", Повторений = " + entry.getValue());
        }


    }
}

