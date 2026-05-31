public class Film {
    String filmName;
    int yearLaunch;
    boolean planIncluded;
    private double rateQuantity;
    private int totalRates;
    int runTime;

    int getTotalRates () {
        return totalRates;
    }

    void displayTechnicalSpecs () {
        System.out.println("Film name  : " + filmName);
        System.out.println("Year Launch: " + yearLaunch);
    }

    void avaluateFilm (double note) {
        rateQuantity += note;
        totalRates++;
    }

    double returnMedia () {
        return rateQuantity / totalRates;
    }
}
