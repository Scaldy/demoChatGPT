package com.example.demo.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("formulario")
public class PersonFormView extends VerticalLayout {

    public PersonFormView() {
        // Título
        H1 title = new H1("Formulario de Persona");

        // Campos
        TextField nameField = new TextField("Nombre");
        TextField cityField = new TextField("Ciudad");
        TextField ageField = new TextField("Edad");

        // Mensaje de salida
        Text result = new Text("");

        // Botones
        Button saveButton = new Button("Guardar", e -> {
            String name = nameField.getValue();
            String city = cityField.getValue();
            String age = ageField.getValue();

            if (name.isBlank() || city.isBlank() || age.isBlank()) {
                Notification.show("⚠️ Todos los campos son obligatorios.", 3000, Notification.Position.MIDDLE);
                return;
            }

            result.setText("👤 " + name + " vive en " + city + " y tiene " + age + " años.");
        });

        Button clearButton = new Button("Limpiar", e -> {
            nameField.clear();
            cityField.clear();
            ageField.clear();
            result.setText("");
        });

        // Layout del formulario
        FormLayout formLayout = new FormLayout(nameField, cityField, ageField);

        add(title, formLayout, saveButton, clearButton, result);
        setAlignItems(Alignment.CENTER);
    }
}

