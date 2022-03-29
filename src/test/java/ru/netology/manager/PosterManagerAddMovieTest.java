package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerAddMovieTest {

    PosterManager manager = new PosterManager();

    // Тестовые данные
    MovieItem movie1 = new MovieItem(1, "genre1", "movieName1", "imagePosterURL1");
    MovieItem movie2 = new MovieItem(2, "genre2", "movieName2", "imagePosterURL2");
    MovieItem movie3 = new MovieItem(3, "genre4", "movieName3", "imagePosterURL3");

    public void prepareManager() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
    }

    @Test
    public void AddMovieEmptyManagerTest() {
        manager.addMovie(movie1);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void AddMovieNewMovieTest() {
        prepareManager();
        manager.addMovie(movie3);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void AddMovieDoubleMovieTest() {
        prepareManager();
        manager.addMovie(movie3);
        manager.addMovie(movie3);
        MovieItem[] expected = manager.findLast();
        MovieItem[] actual = new MovieItem[]{movie3, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }
}