package com.mitrais;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamExercise {

    public StreamExercise() {
        List<Book> dummyData = InitData(30);
    }

    public void printData(List<Book> list) {
        for (Book data : list) {
            System.out.println(data.toString());
        }
    }

    public List<Book> InitData(int size) {
        String[] titleA = {"Deep", "Ocean", "Jazz", "Forest", "Money", "Tail"};
        String[] titleB = {"Under", "Nice", "Angry", "True", "Should", "Could"};
        String[] titleC = {"Risk", "Utility", "Key", "Alone", "Vanish", "Wall"};

        List<Book> listDummy = new ArrayList<>();
        Book dummyData;

        for (int i = 0; i < size; i++) {
            String title = titleA[new Random().nextInt(6)];
            title += titleB[new Random().nextInt(6)];
            title += titleC[new Random().nextInt(6)];

            dummyData = new Book(i, title, new Random().nextInt(20), new Random().nextBoolean());
            listDummy.add(dummyData);
        }

        return listDummy;
    }
}
