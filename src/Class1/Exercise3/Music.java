package Class1.Exercise3;

public class Music {
    String title;
    String artist;
    int yearLaunch;
    double rating;
    int sumRating;
    int totalRating;

    void displaySpecs () {
        System.out.println("Music title       : " + title);
        System.out.println("Artist            : " + artist);
        System.out.println("Year launch       : " + yearLaunch);
        System.out.println("Number of reviews : " + totalRating);
    }

    void avaluate (double note) {
        sumRating += note;
        totalRating++;
    }

    double returnMedia () {
        return sumRating / totalRating;
    }
}
