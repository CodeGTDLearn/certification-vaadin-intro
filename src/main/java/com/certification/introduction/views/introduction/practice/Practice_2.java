package com.certification.introduction.views.introduction.practice;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;

public class Practice_2 extends VerticalLayout {

  public Practice_2() {

    var title = new H2("Practice Exercise 04");
    add(title);


    var eventName = new TextField("Event Name:");
    var description = new TextArea("Event Description:");
    var eventDate = new DatePicker("Event Date:");
    var eventType = new ComboBox<>("Event Type:");
    eventType.setItems("Workshop", "Webinar");
    var qtdeAttenddes = new IntegerField();
    var emailOrganizer = new EmailField("Organizer Email:");
    var row = new HorizontalLayout();
    var submitButton = new Button("Submit Registration");
    var cancelButton = new Button("Cancel");
    row.add(submitButton, cancelButton);

    var venueType = new RadioButtonGroup<>();
    venueType.setLabel("Venue Type:");
    venueType.setItems("Indoor","Outdoor","Virtual");

    var amenities = new CheckboxGroup<>();
    amenities.setLabel("Amenities:");
    amenities.setItems("Wi-fi","Catering","Parking");

    Upload uploadfile = new Upload();
    uploadfile.setAcceptedFileTypes("image/*");



    //
    add(eventName,
        description,
        eventDate,
        eventType,
        qtdeAttenddes,
        emailOrganizer,
        venueType,
        amenities,
        uploadfile,
        row
    );


  }
}