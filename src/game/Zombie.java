package game;

public class Zombie extends Enemy{
    //Membuat Method
    public Zombie (String name, int hp, int attackPoin) {
        super (name, hp, attackPoin);
    }

    void walk () {
        System.out.println("Zombie Jalan-Jalan");
    }
}
