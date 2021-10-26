package com.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    Map<String, List<String>> phonebookMap = new HashMap<>();

    public void add(Contact contact) {
        List<String> phoneList = phonebookMap.get(contact.lastName);
        if (phoneList == null) {
            List<String> listOfNumbers = new ArrayList<>();
            listOfNumbers.add(contact.phoneNumber);
            phonebookMap.put(contact.lastName, listOfNumbers);
        } else {
            phoneList.add(contact.phoneNumber);
        }
    }

    public void get(String lastName) {
        List<String> x = phonebookMap.get(lastName);
        if (x == null) {
            System.out.println("Не найден контакт по заданой фамилии");
        } else {
            System.out.println(x);
        }

    }

    public void showAll() {
        System.out.println(phonebookMap);
    }
}
