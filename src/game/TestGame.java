package game;

public class TestGame {
    public static void main(String[] args) {
        //Membuat Objek
        Zombie zombie  = new Zombie("Zombie Land",20,2);
        Pocong pocong = new Pocong("Pocong Kliwon",25,5);
        Burung burung = new Burung("Burung Hantu",15,1);
        System.out.println("Musuh 1");
        System.out.println("---------------------------");
        System.out.println("Nama                : " +zombie.getName());
        System.out.println("Heatlh Power (HP)   : " +zombie.getHp());
        System.out.println("Attack Point        : " +zombie.getAttackPoin());
        zombie.attack();
        zombie.walk();
        System.out.println();
        System.out.println("Musuh 2");
        System.out.println("---------------------------");
        System.out.println("Nama                : " +pocong.getName());
        System.out.println("Heatlh Power (HP)   : " +pocong.getHp());
        System.out.println("Attack Point        : " +pocong.getAttackPoin());
        pocong.attack();
        pocong.jump();
        System.out.println();
        System.out.println("Musuh 3");
        System.out.println("---------------------------");
        System.out.println("Nama                : " +burung.getName());
        System.out.println("Heatlh Power (HP)   : " +burung.getHp());
        System.out.println("Attack Point        : " +burung.getAttackPoin());
        burung.attack();
        burung.walk();
        burung.jump();
        burung.fly();
    }
}
