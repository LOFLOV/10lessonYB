package com.geekbrains;

import java.util.*;

public class MainApp {


    public static void main(String[] args) {
// Задание 1
        List<String> list = new ArrayList<>();
        list.add("Оля");
        list.add("Оля");
        list.add("Оля");
        list.add("Коля");
        list.add("Артур");
        list.add("Миха");
        list.add("Denis");
        list.add("Оля");
        list.add("Антон");
        list.add("Коля");
        list.add("Макс");
        list.add("Макс");
        list.add("Валера");
        list.add("Адам");
        list.add("Макс");
        Set<String> set = new LinkedHashSet<>(list);

        System.out.println("кол-во слов в масиве: " + list.size());
        System.out.println("кол-во уникальных слов: " + set.size() + " " + set);
        System.out.println("сколько раз встречается каждое слово " + searchTwinWord(list));
        System.out.println("   №2 *****************************    ********************************");

//Задание 2

        Phonebook phonebook = new Phonebook();
        Contact clien1 = new Contact("Joba", "88005553535");
        phonebook.add(new Contact("Joba", "234dwatrichitiri"));
        phonebook.add(new Contact("Joba", "213131"));
        phonebook.add(new Contact("STEPANOV", "911"));
        phonebook.add(new Contact("POROSHENKO", "79000090909"));

        phonebook.add(clien1);              //метод add()
        phonebook.showAll();
        phonebook.get("Jobaa");             //метод get()

    }

    public static HashMap<String, Integer> searchTwinWord(List<String> listOfWords) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        for (String word : listOfWords) {
            Integer value = hm.get(word);
            if(value == null) {
                hm.put(word, 1);
            } else {
                hm.put(word, value + 1);
            }
        }
        return hm;
    }



}

