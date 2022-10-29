package encapsulation;

public class Main {

    public static void main(String[] args) {
        //inisialisasi class
        Car cars = new Car("Pink","Avanza",4);

        cars.color = "pink";
        cars.manufactured = "avanza";
        cars.wheels = 4;

        System.out.println("warna = "+cars.color);
        System.out.println("merk = "+cars.manufactured);
        System.out.println("jumlah roda = "+cars.wheels);
        cars.deskripsi();
    }
}
