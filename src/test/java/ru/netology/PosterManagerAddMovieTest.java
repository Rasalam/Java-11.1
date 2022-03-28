package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerAddMovieTest {

    public PosterManager manager = new PosterManager(10);

    // Тестовые данные
    MovieItem movie1 = new MovieItem(1, "genre1", "movieName1", "imagePosterURL1");
    MovieItem movie2 = new MovieItem(2, "genre2", "movieName2", "imagePosterURL2");
    MovieItem movie3 = new MovieItem(3, "genre4", "movieName3", "imagePosterURL3");

    public void prepareManager() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
    }

    @Test
    public void AddMovie_EmptyManager_Test() {
        manager.addMovie(movie1);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void AddMovie_NewMovie_Test() {
        prepareManager();
        manager.addMovie(movie3);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void AddMovie_DoubleMovie_Test() {
        prepareManager();
        manager.addMovie(movie3);
        manager.addMovie(movie3);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie3, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }
}