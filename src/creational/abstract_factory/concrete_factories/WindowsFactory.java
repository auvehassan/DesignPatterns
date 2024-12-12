package creational.abstract_factory.concrete_factories;

import creational.abstract_factory.abstract_factory.UIFactory;
import creational.abstract_factory.abstract_products.Button;
import creational.abstract_factory.abstract_products.Checkbox;
import creational.abstract_factory.concrete_products.WindowsButton;
import creational.abstract_factory.concrete_products.WindowsCheckbox;

// Factory for Windows UI components
public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}