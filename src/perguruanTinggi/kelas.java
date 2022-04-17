package perguruanTinggi;

import java.util.ArrayList;
import java.util.List;

public class kelas {

    //Membuat Variabel
    private int kodeKelas;
    private String namaKelas;
    private List<mahasiswa> daftarMahasiswa;

    //Membuat Method

    public kelas (int kodeKelas, String namaKelas) {
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public int getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(int kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public List<mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void setDaftarMahasiswa(List<mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    @Override
    public String toString () {
        StringBuilder myString = new StringBuilder();
        myString.append("Kode Kelas : ");
        myString.append(kodeKelas);
        myString.append("\tNama kelas : ");
        myString.append(namaKelas);
        myString.append("\nDaftar Mahasiswa : ");
        daftarMahasiswa.forEach((P2_Mahasiswa ) -> {
            myString.append("\n");
            myString.append(P2_Mahasiswa.getNama());
            myString.append("\t");
            myString.append(P2_Mahasiswa.getNrp());
            myString.append("\t");
            myString.append(P2_Mahasiswa.getTabungan().getNoRekening());
            myString.append("\t");
            myString.append(P2_Mahasiswa.getTabungan().getSaldo());
        });
        return myString.toString();
    }
}
