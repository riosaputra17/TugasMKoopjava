public class Person {

    String nama = "";
    String jenisKelamin = "";
    int umur = 0;


    public static void main(String[] args) {

        Person anton = new Person();


        anton.umur = 21;
        anton.nama = "anton";
        anton.jenisKelamin = "laki";

        System.out.println("Nama = " + anton.nama +
                "\nJenis kelamin = " + anton.jenisKelamin + "\nUmur = " + anton.umur);

        Person riko = new Person();
        riko.umur = 24;
        riko.nama = "riko";
        riko.jenisKelamin = "laki";

        System.out.println("Nama = " + riko.nama +
                "\nJenis kelamin = " + riko.jenisKelamin + "\nUmur = " + riko.umur);

    }
}
