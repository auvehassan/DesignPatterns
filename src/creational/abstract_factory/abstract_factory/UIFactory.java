package creational.abstract_factory.abstract_factory;

import creational.abstract_factory.abstract_products.Button;
import creational.abstract_factory.abstract_products.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}