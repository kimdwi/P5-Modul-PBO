package BangunDatar;

public class PersegiPanjang extends BangunDatar{
    //Membuat Variabel
    private double panjang;
    private double lebar;

    //Membuat Method
    public double getPanjang () {
        return panjang;
    }

    public void setPanjang (double panjang) {
        this.panjang = panjang;
    }

    public double getLebar () {
        return  lebar;
    }

    public void setLebar (double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luas () {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " +luas);
        return  luas;
    }

    @Override
    protected double keliling () {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " +keliling);
        return keliling;
    }
}
