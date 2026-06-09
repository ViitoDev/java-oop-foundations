package br.com.pixelcast.models;

import br.com.pixelcast.calculations.Classificate;

public class Film extends Title implements Classificate {
    private String director;

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
}
