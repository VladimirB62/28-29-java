package com.company;

import java.util.Comparator;

public class FilmByYearComparator implements Comparator<Film> {
    public int compare(Film film1, Film film2) {
        return film1.getYear()-film2.getYear();
    }

}
