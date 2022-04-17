package TestOOP;

public class testUser {
    public static void main(String[] args) {
        user dono = new user();
        //dono.username = "Dono"; //error tidak bisa secara langsung mengakses atribut
        dono.setUsername("Dono");
        dono.setPassword("12345");

        System.out.println("Info akun");
        System.out.println("------------");
        System.out.println("Nama : " + dono.getUsername());
        System.out.println("Password : " + dono.getPassword());
    }
}
