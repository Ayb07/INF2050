package com.company;

public class Collection {
    private String type;
    private String artist;
    private String title;
    private int publication;
    private int rating;



    public Collection(String type, String artist, String title, int publication, int rating){
        this.type = type;
        this.artist = artist;
        this.title = title;
        this.title = title;
        this.publication = publication;
        this.rating = rating;

    }
    public String getType() {
        return type;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getPublication() {
        return publication;
    }

    public int getRating() {
        return rating;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
