package game;

public class Burung extends Enemy{
    //Membuat Method
    public Burung (String name, int hp, int attackPoin) {
        super (name, hp, attackPoin);
    }

    void walk () {
        System.out.println("Burung Berjalan");
    }

    void jump () {
        System.out.println("Burung Loncat-Loncat");
    }

    void fly () {
        System.out.println("Burung Terbang....");
    }
}
