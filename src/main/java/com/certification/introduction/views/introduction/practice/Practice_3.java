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
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.component.upload.Upload;


public class Practice_3 extends VerticalLayout {

  public Practice_3() {

    var title = new H2("Practice Exercise 03");
    add(title);

    var productName = new TextField("Product Name:");
    var description = new TextArea("Description:");
    add(productName, description);

    var quantity = new IntegerField("Quantity");
    quantity.setMin(1);
    quantity.setStep(1);
    add(quantity);

    var category = new ComboBox<String>("Category");
    category.setItems("Eletronics", "Garden", "Books");
    add(category);

    var releaseDate = new DatePicker("Release Date:");
    var realeaseTime = new TimePicker("Release Time:");

    Upload productImage = new Upload();
    productImage.setAcceptedFileTypes("image/*");
    add(releaseDate, realeaseTime, productImage);

    var email = new EmailField("contact Email:");
    var termsAccept = new Checkbox("I accept the terms");
    add(email, termsAccept);

    var submitButton = new Button("Submit Product:");
    var resetButton = new Button("Submit Product:");
    var row = new HorizontalLayout();
    row.add(submitButton,resetButton);
    add(row);

  }
}