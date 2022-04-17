package komposisi;

public class Komputer {
    //Membuat Variabel
    private final String kode;
    private final long harga;
    private final CPU cpu;
    private final RAM ram;
    private final Monitor monitor;
    protected final Keyboard keyboard;

    //Membuat Method
    Komputer (String kode, long harga) {
        this.kode = kode;
        this.harga = harga;
        cpu = new CPU();
        ram = new RAM();
        monitor = new Monitor();
        keyboard = new Keyboard();
    }

    public void displaySpec () {
        System.out.println("Kode                : " +kode);
        System.out.println("Harga               : " +harga);
        System.out.println("\nSpesifikasi CPU");
        System.out.println("-----------------------------------");
        cpu.displaySpecCPU();
        System.out.println("\nSpesifikasi RAM");
        System.out.println("-----------------------------------");
        ram.displaySpecRAM();
        System.out.println("\nSpesifikasi Monitor");
        System.out.println("-----------------------------------");
        monitor.displaySpecMonitor();
        System.out.println("\nSpesifikasi Keyboard");
        System.out.println("-----------------------------------");
        keyboard.displaySpecKeyboard();
    }
}
