package komposisi;

public class Keyboard {
    //Membaut Variabel
    private String merk;
    private String jenisKomunikasi;

    //Membuat Method
    public Keyboard () {
        this.merk = "Acer";
        this.jenisKomunikasi = "Wireless";
    }

    public Keyboard (String merk, String jenisKomunikasi) {
        this.merk = merk;
        this. jenisKomunikasi = jenisKomunikasi;
    }

    public String getMerk () {
        return merk;
    }

    public void setMerk (String merk) {
        this.merk = merk;
    }

    public String getJenisKomunikasi () {
        return jenisKomunikasi;
    }

    public void setJenisKomunikasi (String jenisKomunikasi) {
        this.jenisKomunikasi = jenisKomunikasi;
    }

    public void displaySpecKeyboard () {
        System.out.println("Merk Keyboard       : " +merk);
        System.out.println("Jenis Komunikasi    : " +jenisKomunikasi);
    }
}
