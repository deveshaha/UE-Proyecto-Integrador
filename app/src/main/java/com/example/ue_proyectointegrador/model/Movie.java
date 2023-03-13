package com.example.ue_proyectointegrador.model;

public class Movie {

    private int img;
    private String title;
    private String genre;
    private String time;
    private String director;
    private double rating;
    private String description;

    public Movie() {
    }

    public Movie(int img, String title, String genre, String time, String director, double rating,  String description) {
        this.img = img;
        this.title = title;
        this.genre = genre;
        this.time = time;
        this.director = director;
        this.rating = rating;
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getTime() {
        return time;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", time='" + time + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }
}
