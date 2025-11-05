package com.example.demo.views;

import com.example.demo.service.GreetingService;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("/vaadin") // raíz de la app
public class MainView extends VerticalLayout {

    private final GreetingService service;

    @Autowired
    public MainView(GreetingService service) {
        this.service = service;

        // Título
        H1 title = new H1("Bienvenido a Vaadin + Spring Boot");

        // Campo de texto
        TextField nameField = new TextField("Tu nombre");

        // Texto dinámico (resultado)
        Text result = new Text("");

        // Botón
        Button greetButton = new Button("Saludar", e ->
                result.setText(service.greet(nameField.getValue()))
        );

        Button clearButton = new Button("Limpiar", e -> {
            nameField.clear();
            result.setText("");
        });

        add(title, nameField, greetButton, clearButton, result);
        setAlignItems(Alignment.CENTER);
    }
}

