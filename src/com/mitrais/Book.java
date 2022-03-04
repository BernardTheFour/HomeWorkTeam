package com.mitrais;

public class Book {
    int id;
    String title;
    int numberOfBorrower;
    boolean availability;

    public Book(int id, String title, int numberOfBorrower, boolean availability) {
        this.id = id;
        this.title = title;
        this.numberOfBorrower = numberOfBorrower;
        this.availability = availability;
    }

    public void changeData(int id, String title, int numberOfBorrower, boolean availability) {
        this.id = id;
        this.title = title;
        this.numberOfBorrower = numberOfBorrower;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfBorrower() {
        return numberOfBorrower;
    }

    public boolean isAvailabe() {
        return availability;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", numberOfBorrower=" + numberOfBorrower +
                ", availability=" + availability +
                '}';
    }
}
