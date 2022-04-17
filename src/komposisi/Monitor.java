package komposisi;

public class Monitor {
    //Membuat Variabel
    private String merk;
    private int ukuranInch;

    //Membuat Method
    public Monitor () {
        this.merk = "Intel HD Graphics";
        this.ukuranInch = 14;
    }

    public Monitor (String merk, int ukuranInch) {
        this.merk = merk;
        this.ukuranInch = ukuranInch;
    }

    public String getMerk () {
        return merk;
    }

    public void setMerk (String merk) {
        this.merk = merk;
    }

    public int getUkuranInch () {
        return ukuranInch;
    }

    public void setUkuranInch (int ukuranInch) {
        this.ukuranInch = ukuranInch;
    }

    public void displaySpecMonitor () {
        System.out.println("Merk Monitor            : " +merk);
        System.out.println("Ukuran Monitor (Inch)   : " +ukuranInch);
    }
}
