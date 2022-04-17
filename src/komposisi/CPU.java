package komposisi;

public class CPU {
    //Membuat Variabel
    private String merk;
    private double kecepatanGHZ;

    //Membuat Method
    public CPU () {
        this.merk = "Intel Core-i3";
        this.kecepatanGHZ = 2.5;
    }

    public CPU (String merk, double kecepatanGHZ) {
        this.merk = merk;
        this.kecepatanGHZ = kecepatanGHZ;
    }

    public String getMerk () {
        return merk;
    }

    public void setMerk (String merk) {
        this.merk = merk;
    }

    public double getKecepatanGHZ () {
        return  kecepatanGHZ;
    }

    public void setKecepatanGHZ (double kecepatanGHZ) {
        this.kecepatanGHZ = kecepatanGHZ;
    }

    public void displaySpecCPU () {
        System.out.println("Merk CPU        : " +merk);
        System.out.println("Kecepatan CPU   : " +kecepatanGHZ);
    }
}
