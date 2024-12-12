package creational.abstract_factory.concrete_products;

import creational.abstract_factory.abstract_products.Checkbox;

// Concrete product for Mac Checkbox
public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
}