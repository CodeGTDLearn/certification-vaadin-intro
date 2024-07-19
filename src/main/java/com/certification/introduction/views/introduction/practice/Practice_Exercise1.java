package com.certification.introduction.views.introduction.practice;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;

import static com.vaadin.flow.component.button.ButtonVariant.MATERIAL_CONTAINED;

public class Practice_Exercise1 extends VerticalLayout {

  public Practice_Exercise1() {

    var title = new H2("Practice Exercise 01");
    add(title);

    var booktitle = new TextField("Book Title:");
    var author = new TextField("Author:");
    add(booktitle, author);

    var sinopsis = new TextArea("Sinopsis");
    add(sinopsis);

    var price = new NumberField("Price:");
    price.setStep(0.01);
    price.setSuffixComponent(new Span("$Can"));
    add(price);

    var pages =  new IntegerField("Page Numbers:");
    add(pages);

    var datePublish = new DatePicker("Publish Date:");
    add(datePublish);

    var comboGenre = new ComboBox<String>();
    comboGenre.setItems("Fiction", "Adventure", "Romance","Horror");
    add(comboGenre);
    
    var uploadFile = new Upload();
    uploadFile.setAcceptedFileTypes("image/jpge","image/png");
    add(uploadFile);

    var submitButton = new Button("Submit");
    submitButton.addThemeVariants(MATERIAL_CONTAINED);
    var saveDraftButton = new Button("Save Draft");

    var row = new HorizontalLayout();
    row.add(submitButton, saveDraftButton);
    add(row);

  }
}