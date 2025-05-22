import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 11));
        cars.add(new Car("Audi", 24));
        cars.add(new Car("Volvo", 56));
        cars.add(new Car("Ford", 49));
        cars.add(new Car("Honda", 19));
        cars.add(new Car("Audi", 38));
        cars.add(new Car("Volvo", 26));
        cars.add(new Car("Ford", 34));
        cars.add(new Car("Honda", 22));
        cars.add(new Car("Audi", 31));

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}