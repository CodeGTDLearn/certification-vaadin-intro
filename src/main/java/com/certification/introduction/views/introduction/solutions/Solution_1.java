package com.certification.introduction.views.introduction.solutions;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;

import static com.vaadin.flow.component.button.ButtonVariant.MATERIAL_CONTAINED;

public class Solution_1 extends VerticalLayout {
  public Solution_1() {

    TextField title = new TextField("Book Title:");
    TextField author = new TextField("Author:");
    add(title, author);

    TextArea synopsis = new TextArea("Sinopsis:");
    add(synopsis);

    NumberField price = new NumberField("Price:");
    price.setSuffixComponent(new Span("$"));
    price.setStep(0.01);
    add(price);

    IntegerField pageCount = new IntegerField("Page Numbers:");
    pageCount.setMin(1);
    add(pageCount);

    DatePicker publishDate = new DatePicker("Publish Date:");
    add(publishDate);

    ComboBox<String> genre = new ComboBox<>("Genre:");
    genre.setItems("Fiction", "Adventure", "Romance", "Horror");
    add(genre);

    Upload coverUpload = new Upload();
    coverUpload.setAcceptedFileTypes("image/jpeg", "image/png");
    add(coverUpload);

    Button submitButton = new Button("Submite");
    submitButton.addThemeVariants(MATERIAL_CONTAINED);
    Button draftButton = new Button("Save Draft");

    HorizontalLayout row = new HorizontalLayout();
    row.add(submitButton, draftButton);
    add(row);
  }
}