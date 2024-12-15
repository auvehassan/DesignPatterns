package creational.prototype;

class Shape implements Prototype {
    private String type;
    private String color;

    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported");
        }
    }

    @Override
    public String toString() {
        return "Shape [type=" + type + ", color=" + color + "]";
    }
}