package com.company;

import java.util.Comparator;

public class FilmByRatingComparator implements Comparator<Film> {
    public int compare(Film film1, Film film2) {
        return (int) ((film1.getRatingByIMDb())*10 - (film2.getRatingByIMDb())*10);
    }

}
