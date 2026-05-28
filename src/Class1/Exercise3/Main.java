package Class1.Exercise3;

public class Main {
    static void main() {
        Music music1 = new Music();
        music1.title = "Vazio";
        music1.artist = "Aklipe44";
        music1.avaluate(10);
        music1.yearLaunch = 2026;

        double avaluateMedia = music1.returnMedia();
        music1.displaySpecs();
        System.out.println("Avaluate media    : " + avaluateMedia);
    }
}
