package pl.kwec.players;

import java.util.Scanner;

public class PlayerHuman extends Player {

    private Scanner in = new Scanner(System.in);

    public PlayerHuman(){}
    public PlayerHuman(String name){
        super(name);
    }

    @Override
    public int draw(){
        System.out.print("Wprowadź liczbe od 1 do 6: ");
        return in.nextInt();
    }
}
