package perguruanTinggi;

import akunbank.Tabungan;

public class mahasiswa {
    private int nrp;
    private String nama;
    private Tabungan tabungan;

    public mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
        this.tabungan = new Tabungan(0,50000);
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}
