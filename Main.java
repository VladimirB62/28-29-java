package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Film f1 = new Film("Peaky Blinders","Drama", 2013, 9.4f);
        Film f2 = new Film("Terminator", "Fiction", 1984, 8.3f);
        Film f3 = new Film("Alien", "Fiction, Horror", 1988, 9.4f);
        Film f4 = new Film("Godfather", "Criminal", 1972, 9.2f);

        Film[] films = {f1, f2, f3, f4};

        print(films);
    }

    public static void print(Film[] films){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the sort method (1-title, 2-genre, 3-year of release, 4-rating by IMDb)");
        int sortMethod = sc.nextInt();
        switch(sortMethod) {
            case 1:
                Arrays.sort(films, new FilmByTitleComparator()); break;
            case 2:
                Arrays.sort(films); break;
            case 3:
                Arrays.sort(films, new FilmByYearComparator().reversed());break;
            case 4:
                Arrays.sort(films, new FilmByRatingComparator().reversed());break;
        }
        for (Film f:films) {
            System.out.println(f);
        }
    }

}
