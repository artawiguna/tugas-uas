package app;

public class App {
    public static void main(String[] args) throws Exception {
        PelangganBaru pelanggan1 = new PelangganBaru();
        PelangganLama pelanggan2 = new PelangganLama();
        TeknisiHardware teknisi1 = new TeknisiHardware();
        TeknisiJaringan teknisi2 = new TeknisiJaringan();
        TeknisiSoftware teknisi3 = new TeknisiSoftware();
        pelanggan1.nama = "jho";
        pelanggan1.alamatEmail ="atya@gmail.com";
        pelanggan1.password = "********";
        pelanggan1.saldo = 0;
        pelanggan2.nama = "Arta wiguna";
        pelanggan2.alamatEmail ="orangganteng12300@gmail.com";
        pelanggan2.password = "************";
        pelanggan2.saldo = 5000000;
        pelanggan2.vocher = 10;
        teknisi1.nama = "jody";
        teknisi1.alamatEmail = "jody@gmail.com";
        teknisi1.password ="******";
        teknisi1.permasalahan="printer mati";
        teknisi1.reward= 10;
        teknisi2.nama = "lala";
        teknisi3.nama = "bobi";
    
        System.out.println(pelanggan1.nama);
        System.out.println(pelanggan2.nama);
        System.out.println(teknisi1.nama);
        System.out.println(teknisi2.nama);
        System.out.println(teknisi3.nama);
    }
}