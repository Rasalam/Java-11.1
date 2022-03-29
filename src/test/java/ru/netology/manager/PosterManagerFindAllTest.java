package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerFindAllTest {

    PosterManager manager = new PosterManager();
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

    @Test                                                   // 0 фильмов всего
    public void findAllMovieInList0Test() {
        MovieItem[] expected = manager.findAll();
        MovieItem[] actual = new MovieItem[]{};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // 1 фильмов всего
    public void findAllMovieInList1Test() {
        manager.addMovie(movie1);
        MovieItem[] expected = manager.findAll();
        MovieItem[] actual = new MovieItem[]{movie1};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // 9 фильмов всего
    public void findAllMovieInList9Test() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        MovieItem[] expected = manager.findAll();
        MovieItem[] actual = new MovieItem[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9};
        assertArrayEquals(expected, actual);
    }

    @Test                                                   // 10 фильмов всего
    public void findAllMovieInList10Test() {
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
        MovieItem[] expected = manager.findAll();
        MovieItem[] actual = new MovieItem[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        assertArrayEquals(expected, actual);
    }

}
