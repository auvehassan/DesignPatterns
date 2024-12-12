package creational.abstract_factory.concrete_products;

import creational.abstract_factory.abstract_products.Checkbox;

// Concrete product for Windows Checkbox
public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}