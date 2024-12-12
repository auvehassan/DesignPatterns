package creational.abstract_factory.concrete_products;

import creational.abstract_factory.abstract_products.Button;

// Concrete product for Windows Button
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}