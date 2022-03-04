package com.mitrais;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExercise {
    public StreamExercise() {
        // generate dummy data
        List<Book> dummyData = InitData(15);

        // print initial data
        System.out.println("\n----Initial data----");
        printData(dummyData);

        // filter book that available to borrow
        System.out.println("\n----Available Book----");

        List<Book> bookAvailable = dummyData.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());

        printData(bookAvailable);

        // get Id and title of book that available to borrow
        System.out.println("\n----Book can be borrowed----");

        Map<Integer, String> bookCanBorrow;
        bookCanBorrow = bookAvailable.stream()
                .collect(Collectors.toMap(Book::getId, Book::getTitle));

        // print
        for (Map.Entry<Integer, String> entry : bookCanBorrow.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }

    public void printData(List<Book> list) {
        for (Book data : list) {
            System.out.println(data.toString());
        }
    }

    public List<Book> InitData(int size) {
        // randomized book title
        String[] titleA = {"Deep", "Ocean", "Jazz", "Forest", "Money", "Tail"};
        String[] titleB = {"Under", "Have", "Angry", "True", "Should", "Could"};
        String[] titleC = {"Risk", "Utility", "Key", "Story", "Vanish", "Wall"};

        List<Book> listDummy = new ArrayList<>();
        Book dummyData;
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            String title = titleA[random.nextInt(6)];
            title += " " + titleB[random.nextInt(6)] + " ";
            title += titleC[random.nextInt(6)];

            dummyData = new Book(i, title, random.nextInt(20), random.nextBoolean());
            listDummy.add(dummyData);
        }

        return listDummy;
    }
}
