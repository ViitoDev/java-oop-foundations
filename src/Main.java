import br.com.pixelcast.calculations.TimeCalculate;
import br.com.pixelcast.models.Film;
import br.com.pixelcast.models.Serie;

public class Main {
    public static void main() {
        Film film1 = new Film();
        Serie serie1 = new Serie();
        TimeCalculate calculator = new TimeCalculate();

        film1.setName("Mortal Kombat");
        film1.setYearLaunch(2018);
        film1.setRunTime(110);

        film1.displayTechnicalSpecs();
        film1.avaluateFilm(10);
        film1.avaluateFilm(0);
        System.out.println("Total rating : " + film1.getTotalRates());
        System.out.println(film1.returnMedia());

        serie1.setName("The office");
        serie1.setYearLaunch(2005);
        serie1.setSeasons(9);
        serie1.setSeasonsEpisodes(11);
        serie1.setSeasonMinutes(30);
        serie1.displayTechnicalSpecs();
        System.out.println("Duration for binge-watching : " + serie1.getRunTime());

        calculator.include(film1);
        System.out.println(calculator.getTotalTime());

    }
}