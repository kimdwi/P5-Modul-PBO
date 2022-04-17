package BangunDatar;

public class Lingkaran extends BangunDatar{
    //Membuat Variabel
    private double jariJari;

    //Membuat Method
    public double getJariJari () {
        return jariJari;
    }

    public void setJariJari (double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas () {
        double luas = Math.PI * jariJari;
        System.out.println("Luas Lingkaran : " +luas);
        return luas;
    }

    @Override
    public double keliling () {
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran : " +keliling);
        return  keliling;
    }
}
