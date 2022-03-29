package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerSelectedMaxLengthMovieListTest {

    // Максимальная длина ленты пользовательская

    // Тестовые данные
    MovieItem movie1 = new MovieItem(1, "genre1", "movieName1", "imagePosterURL1");
    MovieItem movie2 = new MovieItem(2, "genre2", "movieName2", "imagePosterURL2");
    MovieItem movie3 = new MovieItem(3, "genre4", "movieName3", "imagePosterURL3");
    MovieItem movie4 = new MovieItem(4, "genre1", "movieName4", "imagePosterURL4");
    MovieItem movie5 = new MovieItem(5, "genre6", "movieName5", "imagePosterURL5");
    MovieItem movie6 = new MovieItem(6, "genre1", "movieName6", "imagePosterURL6");
    MovieItem movie7 = new MovieItem(7, "genre2", "movieName7", "imagePosterURL7");
    MovieItem movie8 = new MovieItem(8, "genre5", "movieName8", "imagePosterURL8");
    MovieItem movie9 = new MovieItem(9, "genre1", "movieName9", "imagePosterURL9");
    MovieItem movie10 = new MovieItem(10, "genre3", "movieName10", "imagePosterURL10");
    MovieItem movie11 = new MovieItem(11, "genre3", "movieName11", "imagePosterURL11");
    MovieItem movie12 = new MovieItem(12, "genre6", "movieName12", "imagePosterURL12");

    @Test                                                   // Длина ленты 0 элементов
    public void findLast0MovieInListTest() {
        PosterManager manager = new PosterManager(0);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // Длина ленты 1 элемент
    public void findLast1MovieInListTest() {
        PosterManager manager = new PosterManager(1);
        manager.addMovie(movie1);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie1};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // Длина ленты 2 элемента
    public void findLast2MovieInListTest() {
        PosterManager manager = new PosterManager(2);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // Длина ленты 11 элементов
    public void findLast11MovieInListTest() {
        PosterManager manager = new PosterManager(11);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // Длина ленты 12 элементов
    public void findLast12MovieInListTest() {
        PosterManager manager = new PosterManager(12);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // Длина ленты 12 элементов, 13 элементов в массиве

    public void findLast12in13MovieInListTest() {
        PosterManager manager = new PosterManager(12);
        MovieItem movie13 = new MovieItem(13, "genre6", "movieName13", "imagePosterURL13");
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }
}