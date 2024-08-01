package com.certification.introduction.views.introduction;

import com.certification.introduction.views.introduction.practice.Practice_1;
import com.certification.introduction.views.introduction.practice.Practice_2;
import com.certification.introduction.views.introduction.practice.Practice_3;
import com.certification.introduction.views.introduction.practice.Practice_4;
import com.certification.introduction.views.introduction.solutions.Solution_1;
import com.certification.introduction.views.introduction.solutions.Solution_2;
import com.certification.introduction.views.introduction.solutions.Solution_3;
import com.certification.introduction.views.introduction.solutions.Solution_4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("introduction")
@Route(value = "")
@RouteAlias(value = "")
public class CertTrainingView extends VerticalLayout {

  public CertTrainingView() {

    //solutionSelector(1);
    practiceSelector(1);
  }

  public void solutionSelector(int solutionNumber) {

    switch (solutionNumber) {
      case 1 -> add(new Solution_1());
      case 2 -> add(new Solution_2());
      case 3 -> add(new Solution_3());
      case 4 -> add(new Solution_4());
      default -> throw new IllegalArgumentException("Exercise not found: " + solutionNumber);
    }
  }

  public void practiceSelector(int practiceNumber) {

    switch (practiceNumber) {
      case 1 -> add(new Practice_1());
      case 2 -> add(new Practice_2());
      case 3 -> add(new Practice_3());
      case 4 -> add(new Practice_4());
      default -> throw new IllegalArgumentException("Exercise not found: " + practiceNumber);
    }
  }

}