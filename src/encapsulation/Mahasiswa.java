package encapsulation;

public class Mahasiswa {

    public static void main(String[] args) {

        DataDiri data = new DataDiri("A",20,300,45);

        System.out.println(data.nama);

        data.setAlamat("Bandarlampung");
        System.out.println(data.getAlamat());

        data.kenalan();
    }
}


/*buat sebuah class berisi data diri dan implementasikan
* menggunakan contructor, setter-getter dan function
* constructor : nama, usia, berat badan, tinggi badan
* setter-getter : alamat, no.hp dan hobi
* function dengan output "Hai, nama saya <nama> dan saya
* berumur <usia> tahun"*/







