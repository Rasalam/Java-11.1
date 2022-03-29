package ru.netology.domain;

public class MovieItem {
    private int id;
    private String movieGenre;
    private String movieName;
    private String imagePosterURL;


    public MovieItem(int id, String movieGenre, String movieName, String imagePosterURL) {
        this.id = id;
        this.movieGenre = movieGenre;
        this.movieName = movieName;
        this.imagePosterURL = imagePosterURL;
    }

}
