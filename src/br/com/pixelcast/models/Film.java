package br.com.pixelcast.models;

import br.com.pixelcast.calculations.Classificate;

public class Film extends Title implements Classificate {
    private String director;

    public Film(String name) {
        this.setName(name);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificate() {
        return (int) returnMedia() / 2;
    }

    @Override
    public String toString() {
        return "movie name : " + this.getName() + " (" + this.getYearLaunch() + ")";
    }
}
