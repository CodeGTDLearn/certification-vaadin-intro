package com.certification.introduction.views.introduction.solutions;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

import static com.vaadin.flow.component.button.ButtonVariant.LUMO_PRIMARY;

public class Exercise2_UserRegistrationForm extends VerticalLayout {
  public Exercise2_UserRegistrationForm() {

    TextField name = new TextField("Name:");
    EmailField email = new EmailField("E-mail:");
    add(name, email);

    DatePicker birthDate = new DatePicker("BirthDate:");
    add(birthDate);

    NumberField age = new NumberField("Age:");
    age.setStep(1);
    age.setMin(18);
    add(age);

    TextArea address = new TextArea("Address:");
    add(address);

    ComboBox<String> country = new ComboBox<>("Country:");
    country.setItems("Brasil", "Portugal", "Canada", "Finland");
    add(country);

    Checkbox terms = new Checkbox("Aceito os termos e condições");
    add(terms);

    Button registerButton = new Button("Registrar");
    registerButton.addThemeVariants(LUMO_PRIMARY);
    Button clearButton = new Button("Limpar");

    HorizontalLayout buttonLayout = new HorizontalLayout();
    buttonLayout.add(registerButton, clearButton);
    add(buttonLayout);
  }
}