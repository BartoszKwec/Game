package pl.kwec.players;


import java.util.Random;

public class PlayerComp extends Player {

    private Random r = new Random();
    public PlayerComp(String name){
        super(name);
    }
    public PlayerComp(){}

    @Override
    public int draw() {
        return r.nextInt(6)+1;
    }
}
