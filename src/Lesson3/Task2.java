package Lesson3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static class Phonebook {

        HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

        void add(String surname, String telNumber) {
            ArrayList<String> telList = phonebook.get(surname);
            if (telList == null) telList = new ArrayList<>();
            telList.add(telNumber);
            phonebook.put(surname, telList);
        }

        public ArrayList<String> get(String name) {
            return phonebook.get(name);
        }


        public static void main(String[] args) {
            Phonebook phoneBook = new Phonebook();

            phoneBook.add("Иванов", "101");
            phoneBook.add("Иванов", "102");
            phoneBook.add("Петров", "103");
            phoneBook.add("Сидоров", "104");
            phoneBook.add("Иванов", "105");
            phoneBook.add("Петров", "106");
            phoneBook.add("Смирнов", "107");
            phoneBook.add("Иванов", "108");


            System.out.printf("Запрошенной фамилии соответствует(ют) номер(а) %s", phoneBook.get("Петров"));

        }


    }


}
