package com.certification.introduction.views.introduction.solutions;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;

public class Exercise4_EventRegistrationForm extends VerticalLayout {

  public Exercise4_EventRegistrationForm() {

    H2 title = new H2("Event Registration");
    add(title);

    TextField eventName = new TextField("Event Name");
    TextArea description = new TextArea("Event Description");
    DatePicker eventDate = new DatePicker("Event Date");

    ComboBox<String> eventType = new ComboBox<>("Event Type");
    eventType.setItems("Conference", "Workshop", "Seminar", "Webinar");

    NumberField expectedAttendees = new NumberField("Expected Attendees");
    expectedAttendees.setMin(1);
    expectedAttendees.setStep(1);

    RadioButtonGroup<String> venueType = new RadioButtonGroup<>();
    venueType.setLabel("Venue Type");
    venueType.setItems("Indoor", "Outdoor", "Virtual");

    CheckboxGroup<String> amenities = new CheckboxGroup<>();
    amenities.setLabel("Amenities");
    amenities.setItems("Wi-Fi", "Catering", "Parking", "Audio/Visual Equipment");

    Upload eventBanner = new Upload();
    eventBanner.setAcceptedFileTypes("image/*");

    EmailField organizerEmail = new EmailField("Organizer Email");

    Button submitButton = new Button("Submit Registration");
    Button cancelButton = new Button("Cancel");

    HorizontalLayout buttonLayout = new HorizontalLayout(submitButton, cancelButton);

    add(eventName, description, eventDate, eventType, expectedAttendees, venueType,
        amenities, eventBanner, organizerEmail, buttonLayout
    );


  }

}