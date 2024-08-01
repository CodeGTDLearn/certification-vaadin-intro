package com.certification.introduction.views.introduction.practice;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

import static com.vaadin.flow.component.button.ButtonVariant.LUMO_PRIMARY;

public class Practice_2 extends VerticalLayout {

  public Practice_2() {

    var title = new H2("Practice Exercise 02");
    add(title);

    var name = new TextField("Name:");
    var email = new EmailField("E-mail:");
    var birthDay = new DatePicker("BirthDate:");
    var age = new IntegerField("Age:");
    var address = new TextArea("Address:");
    var comboCountry = new ComboBox<String>("Country:");
    comboCountry.setItems("Brasil", "Portugal", "Canada", "Finland");
    var acceptTerms = new Checkbox("I agree with the Conditions");

    var row = new HorizontalLayout();
    Button signUp = new Button("Sign Up");
    signUp.addThemeVariants(LUMO_PRIMARY);
    Button clear = new Button("Clear");
    row.add(signUp, clear);
    add(name, email, birthDay, age, address, comboCountry, acceptTerms, row);

  }
}