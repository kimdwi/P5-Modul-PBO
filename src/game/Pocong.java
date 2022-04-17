package game;

public class Pocong extends Enemy{
    //Membuat Method
    public Pocong (String name, int hp, int attackPoin) {
        super (name, hp, attackPoin);
    }

    void jump () {
        System.out.println("Pocong Loncat-Loncat!");
    }
}
