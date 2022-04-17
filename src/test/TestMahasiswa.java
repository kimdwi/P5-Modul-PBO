package test;

//Mengimport Dari Library Java Serta Package akun_bank dan perguruan_tinggi
import java.util.List;
import java.util.ArrayList;
import akunbank.Tabungan;
import perguruanTinggi.kelas;
import perguruanTinggi.mahasiswa;

public class TestMahasiswa {
    public static void main(String[] args) {
        //Buat 4 Objek Mahasiswa Atas Nama Anton, Budi, Clarisa dan Dono
        mahasiswa anton = new mahasiswa(1106310,"Anton");
        mahasiswa budi = new mahasiswa(1106311,"Budi");
        Tabungan tbudi = new Tabungan(1,100000);
        budi.setTabungan(tbudi);
        mahasiswa clarisa = new mahasiswa(1106312,"Clarisa");
        Tabungan tclarisa = new Tabungan(2,150000);
        clarisa.setTabungan(tclarisa);
        mahasiswa dono = new mahasiswa(1106313,"Dono");
        Tabungan tdono = new Tabungan(3,200000);
        dono.setTabungan(tdono);

        //Membuat 2 Objek Kelas Yaitu kelasRPL dan kelasTI
        kelas kelasRPL = new kelas(1,"Kelas RPL");
        kelas kelasTI = new kelas(2,"Kelas TI");

        //Buat Sebuah 2 Objek List Mahasiswa Yaiut daftarMahasiswaRPL dan daftarMahasiswaTI
        List <mahasiswa> daftarMahasiswaRPL = new ArrayList<>();
        daftarMahasiswaRPL.add(anton);
        daftarMahasiswaRPL.add(clarisa);
        kelasRPL.setDaftarMahasiswa(daftarMahasiswaRPL);

        List <mahasiswa> daftarMahasiswaTI = new ArrayList<>();
        daftarMahasiswaTI.add(budi);
        daftarMahasiswaTI.add(dono);
        kelasTI.setDaftarMahasiswa(daftarMahasiswaTI);

        System.out.println("Data Kelas RPL\n" +kelasRPL.toString());
        System.out.println("\nData Kelas TI\n" +kelasTI.toString());
    }
}
