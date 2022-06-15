package home;

public class MovieTest {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "KPNA";
        one.genre = "TTT";
        one.rating = -2;
        one.playIt();
        Movie too = new Movie();
        too.title = "PVO";
        too.genre = "k";
        too.rating = 5;
        too.playIt();
        Movie three = new Movie();
        three.title = "B-K";
        three.genre = "TNVCD";
        three.rating = 127;
        three.playIt();
    }
}
