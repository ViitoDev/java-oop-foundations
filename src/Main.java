public class Main {
    static void main() {
        Film film1 = new Film();
        film1.filmName = "Mortal Kombat";
        film1.yearLaunch = 2018;
        film1.runTime = 110;

        film1.displayTechnicalSpecs();
        film1.avaluateFilm(10);
        film1.avaluateFilm(0);
        System.out.println("Total rating : " + film1.getTotalRates());
        System.out.println(film1.returnMedia());
    }
}