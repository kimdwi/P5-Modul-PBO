package akunbank;

public class Tabungan {
    private int noRekening;
    private long saldo;

    public Tabungan(int noRekening, long saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(int noRekening) {
        this.noRekening = noRekening;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void debit(long jumlah){
        this.saldo += jumlah;
        System.out.println("Transaksi berhasil. Saldo anda : " + this.saldo);
    }

    public void kredit(long jumlah){
        if(this.saldo <= 0 || (this.saldo - jumlah) <= 1000){
            System.out.println("Transaksi tidak dapat dilakukan. Saldo anda kurang dari saldo minimum setelah penarikan.");
        } else {
            this.saldo -= jumlah;
            System.out.println("Transaksi berhasil. Saldo anda : " + this.saldo);
        }
    }
}
