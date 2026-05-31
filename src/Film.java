public class Film {
    String filmName;
    int yearLaunch;
    boolean planIncluded;
    private double allFilmRate;
    private int totalRates;
    int runTime;

    void displayTechnicalSpecs () {
        System.out.println("Film name  : " + filmName);
        System.out.println("Year Launch: " + yearLaunch);
    }

    void avaluateFilm (double note) {
        allFilmRate += note;
        totalRates++;
    }

    double returnMedia () {
        return allFilmRate / totalRates;
    }
}
