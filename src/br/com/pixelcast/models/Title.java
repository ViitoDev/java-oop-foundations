package br.com.pixelcast.models;

public class Title {
    private String name;
    private int yearLaunch;
    private boolean planIncluded;
    private double rateQuantity;
    private int totalRates;
    private int runTime;

    public int getTotalRates () {
        return totalRates;
    }

    public String getName() {
        return name;
    }

    public int getRunTime() {
        return runTime;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public int getYearLaunch() {
        return yearLaunch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearLaunch(int yearLaunch) {
        this.yearLaunch = yearLaunch;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void displayTechnicalSpecs () {
        System.out.println("br.com.pixelcast.models.Film name  : " + name);
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
