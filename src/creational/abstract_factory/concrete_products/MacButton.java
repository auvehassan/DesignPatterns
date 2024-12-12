package creational.abstract_factory.concrete_products;

import creational.abstract_factory.abstract_products.Button;

// Concrete product for Mac Button
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}