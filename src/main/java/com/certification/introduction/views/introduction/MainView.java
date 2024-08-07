package com.certification.introduction.views.introduction;

import com.certification.introduction.views.introduction.practice.Practice_1;
import com.certification.introduction.views.introduction.practice.Practice_2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Lesson 1: Introduction")
@Route(value = "")
@RouteAlias(value = "")
public class MainView extends VerticalLayout {

  public MainView() {

    practiceSelector(2);
  }

  public void practiceSelector(int practiceNumber) {

    switch (practiceNumber) {
      case 1 -> add(new Practice_1());
      case 2 -> add(new Practice_2());
      default -> throw new IllegalArgumentException("Practice not found: " + practiceNumber);
    }
  }

}