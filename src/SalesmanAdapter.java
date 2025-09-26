public class SalesmanAdapter {
    private Car car;

    public SalesmanAdapter(Car car) {
        this.car = car;
    }

    public void sellCar() {
        System.out.println("Salesman:");
        car.showDetails();
        System.out.println("Car sold");
    }
}
