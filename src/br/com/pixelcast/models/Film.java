package br.com.pixelcast.models;

public class Film {
    String filmName;
    int yearLaunch;
    boolean planIncluded;
    private double rateQuantity;
    private int totalRates;
    int runTime;

    public int getTotalRates () {
        return totalRates;
    }

    public void displayTechnicalSpecs () {
        System.out.println("br.com.pixelcast.models.Film name  : " + filmName);
        System.out.println("Year Launch: " + yearLaunch);
    }

    public void avaluateFilm (double note) {
        rateQuantity += note;
        totalRates++;
    }

    public double returnMedia () {
        return rateQuantity / totalRates;
    }
}
