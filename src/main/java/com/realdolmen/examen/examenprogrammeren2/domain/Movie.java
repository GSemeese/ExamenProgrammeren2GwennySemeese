package com.realdolmen.examen.examenprogrammeren2.domain;

public class Movie {
//3 movie attributen
    private int id;
    private String title;
    private String genre;
//lege constructor
    public Movie() {
        
    }
//constructor met alle attributen
    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }
//getters en setters

    public Movie(int i, String comedy, String ace_ventura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Filmnumber: " + id + "\n Title: " + title + "\n Genre: " + genre;
    }
    
    
}
