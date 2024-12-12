package creational.abstract_factory;

import creational.abstract_factory.abstract_factory.UIFactory;
import creational.abstract_factory.abstract_products.Button;
import creational.abstract_factory.abstract_products.Checkbox;
import creational.abstract_factory.concrete_factories.MacFactory;
import creational.abstract_factory.concrete_factories.WindowsFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        UIFactory factory;
        
        // Configure the application based on the desired platform
        String os = "Windows"; // This could come from system properties or user input
        
        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}