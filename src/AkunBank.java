public class AkunBank {

    int saldo = 100000;


    public static void main(String[] args) {

        System.out.println("selamat datang di BANK RIO");

        AkunBank ABC = new AkunBank();

        ABC.cekSaldo();
        ABC.simpanUang(500000);
        ABC.ambilUang(150000);


    }

    private void cekSaldo() {
        System.out.println("saldo saat ini = Rp." + saldo);

    }

    private void simpanUang(int uang) {
        System.out.println("simpan uang = " + uang);

        saldo = saldo + uang;
        System.out.println("saldo saat ini = " + saldo);

    }private void ambilUang(int uang) {
        System.out.println("ambil uang = " + uang);

        saldo = saldo - uang;
        System.out.println("saldo saat ini = " + saldo);
    }

}
