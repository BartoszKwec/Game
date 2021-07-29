package pl.kwec;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello ");

        Random r = new Random();
        int player, computer;


        do {
            System.out.println("---------------------");
            computer=r.nextInt(6)+1;
            System.out.println("Komputer: "+computer);
            player = r.nextInt(6)+1;
            System.out.println("Gracz: "+player);
            System.out.println("---------------------");
            if(player != computer) System.out.println("Pudło!");
            else System.out.println("Udało się!");


        }while(player != computer);
    }
}
