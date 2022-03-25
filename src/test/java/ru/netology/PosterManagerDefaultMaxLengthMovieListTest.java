package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerDefaultMaxLengthMovieListTest {

    // Максимальная длина ленты по умолчанию (10)


    PosterManager manager = new PosterManager(10);
    // Тестовые  данные
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

    @Test                                                   // 0 фильмов всего, 0 в ленте
    public void test_GetMovieList_MovieInList_0() {
        MovieItem[] expected = manager.getMovieList();
        MovieItem[] actual = new MovieItem[]{};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // 1 фильм всего, 1 в ленте
    public void test_GetMovieList_MovieInList_1() {
        manager.addMovie(movie12);
        MovieItem[] expected = manager.getMovieList();
        MovieItem[] actual = new MovieItem[]{movie12};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // 9 фильмов всего, 9 в ленте
    public void test_GetMovieList_MovieInList_9() {
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        MovieItem[] expected = manager.getMovieList();
        MovieItem[] actual = new MovieItem[]{movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // 10 фильмов всего, 10 в ленте
    public void test_GetMovieList_MovieInList_10() {
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
        MovieItem[] expected = manager.getMovieList();
        MovieItem[] actual = new MovieItem[]{movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4, movie3};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // 11 фильмов всего, 10 в ленте
    public void test_GetMovieList_MovieInList_12() {
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
        MovieItem[] expected = manager.getMovieList();
        MovieItem[] actual = new MovieItem[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5,
                movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }

}