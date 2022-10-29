package encapsulation;

public class Car {
    String color, manufactured;
    int wheels;

    public Car(String color, String manufactured, int wheels) {
        this.color = color;
        this.manufactured = manufactured;
        this.wheels = wheels;
    }

    //tambahkan sebuah fungsi
    public void deskripsi(){
        System.out.println("ini class Car gaes...");
    }

    public int chair(){
        return 8;
    }
}
