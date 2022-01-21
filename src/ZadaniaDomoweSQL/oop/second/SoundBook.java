package ZadaniaDomoweSQL.oop.second;

import ZadaniaDomoweSQL.oop.first.Author;
import ZadaniaDomoweSQL.oop.first.Book;

public class SoundBook extends Book {

    private double duration;
    private int numberOfCarriers;

    public SoundBook(int id, String title, Author author, Author[] additionalAuthors) {
        super(id, title, author, additionalAuthors);
    }

    public SoundBook(int id, String title, Author author, Author[] additionalAuthors, double duration, int numberOfCarriers) {
        super(id, title, author, additionalAuthors);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getNumberOfCarriers() {
        return numberOfCarriers;
    }

    public void setNumberOfCarriers(int numberOfCarriers) {
        this.numberOfCarriers = numberOfCarriers;
    }
}
