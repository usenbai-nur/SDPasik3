public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        Car suv = new SUV();
        SalesmanAdapter sedanSalesman = new SalesmanAdapter(sedan);
        SalesmanAdapter suvSalesman = new SalesmanAdapter(suv);

        sedanSalesman.sellCar();
        System.out.println();
        suvSalesman.sellCar();
    }
}