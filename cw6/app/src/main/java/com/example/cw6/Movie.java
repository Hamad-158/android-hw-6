package com.example.cw6;

public class Movie {

    private  String title;
    private String moinActor;
    private Double movieRote;
    private  int pgRate;
    private String genre;

    public Movie(String title, String moinActor, Double movieRote, int pgRate, String genre) {
        this.title = title;
        this.moinActor = moinActor;
        this.movieRote = movieRote;
        this.pgRate = pgRate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoinActor() {
        return moinActor;
    }

    public void setMoinActor(String moinActor) {
        this.moinActor = moinActor;
    }

    public Double getMovieRote() {
        return movieRote;
    }

    public void setMovieRote(Double movieRote) {
        this.movieRote = movieRote;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
