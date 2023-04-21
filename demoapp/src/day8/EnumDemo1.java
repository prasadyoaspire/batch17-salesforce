package day8;

public class EnumDemo1 {
    public static void main(String[] args) {

        //String s = "SUMMERDFD";

        Seasons season = Seasons.SPRING;

        if(season == Seasons.SUMMER) {
            System.out.println("Very Hot");
        }
        else if(season == Seasons.WINTER) {
            System.out.println("Very Cold");
        }
        else if(season == Seasons.SPRING) {
            System.out.println("GO GREEN");
        }        
    }
}


