package com.certification.introduction.views.introduction;

import com.certification.introduction.views.introduction.practice.Practice_Exercise1;
import com.certification.introduction.views.introduction.practice.Practice_Exercise2;
import com.certification.introduction.views.introduction.practice.Practice_Exercise3;
import com.certification.introduction.views.introduction.practice.Practice_Exercise4;
import com.certification.introduction.views.introduction.solutions.Exercise1_BookSubmissionForm;
import com.certification.introduction.views.introduction.solutions.Exercise2_UserRegistrationForm;
import com.certification.introduction.views.introduction.solutions.Exercise3_ProductSubmissionForm;
import com.certification.introduction.views.introduction.solutions.Exercise4_EventRegistrationForm;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("introduction")
@Route(value = "")
@RouteAlias(value = "")
public class IntroductionView extends VerticalLayout {

  public IntroductionView() {

    //selectExercise(1);
    selectPractice(1);
  }

  public void selectExercise(int exerciseNumber) {

    switch (exerciseNumber) {
      case 1 -> add(new Exercise1_BookSubmissionForm());
      case 2 -> add(new Exercise2_UserRegistrationForm());
      case 3 -> add(new Exercise3_ProductSubmissionForm());
      case 4 -> add(new Exercise4_EventRegistrationForm());
      default -> throw new IllegalArgumentException("Exercise not found: " + exerciseNumber);
    }
  }

  public void selectPractice(int practiceNumber) {

    switch (practiceNumber) {
      case 1 -> add(new Practice_Exercise1());
      case 2 -> add(new Practice_Exercise2());
      case 3 -> add(new Practice_Exercise3());
      case 4 -> add(new Practice_Exercise4());
      default -> throw new IllegalArgumentException("Exercise not found: " + practiceNumber);
    }
  }

}