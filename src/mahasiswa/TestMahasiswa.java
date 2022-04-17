package mahasiswa;

public class TestMahasiswa {
    public static void main(String[] args) {
        //To Do Code Application Logic Here
        Mahasiswa anton = new KetuaHima("Anton", 1106789, "Teknik Informatika");
        anton.info();
        System.out.println("Jenis Kelas = " +anton.getClass().getSimpleName());
        System.out.println();

        Mahasiswa budi = new Mahasiswa("Budi", 1106123);
        budi.info();
        System.out.println("Jenis Kelas = " +budi.getClass().getSimpleName());
        System.out.println(budi.toString());
        System.out.println();

        KetuaHima ucok = new KetuaHima("Ucok", 1105239, "Teknik Elektro");
        ucok.info();
        System.out.println("Jenis Kelas = " +ucok.getClass().getSimpleName());
        System.out.println();

        Mahasiswa butet = new KetuaHima("Butet Sitorus", 1106789, "Bahasa Inggirs");
        butet.info();
        System.out.println("Jenis Kelas = " +butet.getClass().getSimpleName());
        System.out.println(butet.toString());
    }
}
