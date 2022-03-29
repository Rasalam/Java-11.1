package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class PosterManager {
    private int maxLengthMovieList = 10;

    public PosterManager(int maxLengthMovieList) {
        this.maxLengthMovieList = maxLengthMovieList;
    }

    public PosterManager() {

    }

    public MovieItem[] items = new MovieItem[0];

    public void addMovie(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (items.length > maxLengthMovieList) {
            resultLength = maxLengthMovieList;
        } else resultLength = items.length;
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public MovieItem[] findAll() {
        return items;
    }

}

