interface Car {
    void displayModel();
}

class BMW implements Car {
    @Override
    public void displayModel() {
        System.out.println("Brand: BMW, Model: X5");
    }
}

class Audi implements Car {
    @Override
    public void displayModel() {
        System.out.println("Brand: Audi, Model: A6");
    }
}

public class CarModels {
    public static void main(String[] args) {
        Car r = new BMW();
        r.displayModel(); // Output: Brand: BMW, Model: X5
        Car q = new Audi();
        q.displayModel(); // Output: Brand: Audi, Model: A6
    }
}
