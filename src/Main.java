public class Main {
    public static void main(String[] args) {

    FleetOfCars fleet = new FleetOfCars();
    fleet.addCar(new ElectricCar("BA 12345", "BMW", "IX", 5, 23, 400  ));
    fleet.addCar(new ElectricCar("ST 64837", "Tesla", "S-model", 5, 50, 450 ));
    fleet.addCar(new ElectricCar("IA 82074", "Maxus", "Eunic 6", 5, 30, 300 ));

    fleet.addCar(new DieselCar("NK 94750", "Skoda", "Codiac", 5, 25, true ));
    fleet.addCar(new DieselCar("ER 95732", "Skoda", "Fabia", 5, 30, true ));
    fleet.addCar(new DieselCar("NH 95736", "VW", "Passat", 5, 27, false ));

    fleet.addCar(new GasolineCar("OL 65845", "SAAB", "9.5 Turbo", 5, 40 ));
    fleet.addCar(new GasolineCar("ML 46245", "SAAB", "9.3", 5, 45 ));
    fleet.addCar(new GasolineCar("BK 85945", "Mercedes", "Smart", 3, 10 ));

        System.out.println(fleet);

        System.out.println("Total Registration fee = " + fleet.getTotalRegistrationFeeForFleet());

    }
}
