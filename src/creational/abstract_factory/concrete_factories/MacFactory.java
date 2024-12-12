package creational.abstract_factory.concrete_factories;

import creational.abstract_factory.abstract_factory.UIFactory;
import creational.abstract_factory.abstract_products.Button;
import creational.abstract_factory.abstract_products.Checkbox;
import creational.abstract_factory.concrete_products.MacButton;
import creational.abstract_factory.concrete_products.MacCheckbox;

// Factory for Mac UI components
public class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}