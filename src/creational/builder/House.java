package creational.builder;

public class House {
    private int windows;
    private int doors;
    private boolean hasRoof;
    private boolean hasGarage;

    // Private constructor to enforce usage of the builder
    private House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasRoof = builder.hasRoof;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House [windows=" + windows + ", doors=" + doors + ", hasRoof=" + hasRoof + ", hasGarage=" + hasGarage + "]";
    }

    // Static nested builder class
    public static class HouseBuilder {
        private int windows;
        private int doors;
        private boolean hasRoof;
        private boolean hasGarage;

        public HouseBuilder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setRoof(boolean hasRoof) {
            this.hasRoof = hasRoof;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}