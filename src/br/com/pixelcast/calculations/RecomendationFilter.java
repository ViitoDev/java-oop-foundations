package br.com.pixelcast.calculations;

public class RecomendationFilter {
    private String recomendation;

    public void filter(Classificate classificate) {
        if (classificate.getClassificate() >= 4){
            System.out.println("It's one of the current favorites.");
        } else if (classificate.getClassificate() <= 2) {
            System.out.println("Very well rated.");
        } else{
            System.out.println("Watch later.");
        }
    }
}
