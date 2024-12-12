package tourne.personnage;


public class Personnage {
    public String tourner(int fois) {
        if (fois == 1) return "EST";
        return "NORD";
    }

}
