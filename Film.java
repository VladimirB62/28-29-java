package com.company;

public class Film implements Comparable<Film>{
    private String title;
    private String genre;
    private int year;
    private float ratingByIMDb;

    public Film(String title, String genre, int year, float ratingByIMDb) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.ratingByIMDb = ratingByIMDb;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public float getRatingByIMDb() {
        return ratingByIMDb;
    }

    public String toString(){
        return title + " (" + year + "), " +  genre + ", IMDb " + ratingByIMDb;
    }

    public int compareTo(Film o){
        return genre.compareTo(o.genre);
    }
}