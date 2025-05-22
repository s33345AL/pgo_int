import java.util.ArrayList;

public class Car implements Comparable<Car>{
    private String nazwaModelu;
    private int rokProdukcji;
    public ArrayList<Car> pojazdy = new ArrayList<>();


    public Car(String nazwaModelu, int rokProdukcji) {
        this.nazwaModelu = nazwaModelu;
        this.rokProdukcji = rokProdukcji;
    }

    public void add(Car car) {
        pojazdy.add(car);
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.rokProdukcji, car.rokProdukcji);
    }

    @Override
    public String toString() {
        return nazwaModelu + " " + rokProdukcji;
    }
}
