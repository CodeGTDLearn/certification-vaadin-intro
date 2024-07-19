package com.certification.introduction.views.introduction.solutions;

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

public class Exercise3_ProductSubmissionForm extends VerticalLayout {

  public Exercise3_ProductSubmissionForm() {

    H2 title = new H2("Submit New Product");
    add(title);

    TextField productName = new TextField("Product Name");
    TextArea description = new TextArea("Description");
    IntegerField quantity = new IntegerField("Quantity");
    quantity.setMin(1);
    quantity.setStep(1);

    ComboBox<String> category = new ComboBox<>("Category");
    category.setItems("Electronics", "Clothing", "Books", "Home & Garden");

    DatePicker releaseDate = new DatePicker("Release Date");
    TimePicker releaseTime = new TimePicker("Release Time");

    Upload productImage = new Upload();
    productImage.setAcceptedFileTypes("image/*");

    EmailField contactEmail = new EmailField("Contact Email");
    Checkbox termsAccepted = new Checkbox("I accept the terms and conditions");

    Button submitButton = new Button("Submit Product");
    Button resetButton = new Button("Reset");

    HorizontalLayout buttonLayout = new HorizontalLayout(submitButton, resetButton);

    add(productName, description, quantity, category, releaseDate, releaseTime,
        productImage, contactEmail, termsAccepted, buttonLayout
    );

  }

}