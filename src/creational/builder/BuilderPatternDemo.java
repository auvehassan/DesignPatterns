package creational.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Creating a house with a builder
        House house = new House.HouseBuilder()
                .setWindows(4)
                .setDoors(2)
                .setRoof(true)
                .setGarage(true)
                .build();

        System.out.println(house);

        // Creating a simpler house with fewer attributes
        House simpleHouse = new House.HouseBuilder()
                .setWindows(2)
                .setDoors(1)
                .setRoof(false)
                .build();

        System.out.println(simpleHouse);
    }
}