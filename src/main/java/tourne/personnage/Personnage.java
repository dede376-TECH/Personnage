 package tourne.personnage ;
 public class Personnage {
     public String tourner(int fois) {
         String[] orientations = {"NORD", "EST", "SUD", "OUEST"};
         return orientations[fois % 4];
     }
 }