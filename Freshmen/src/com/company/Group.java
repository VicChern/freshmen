package com.company;

public class Group {

    // creating few students with some parameters
    Students student1 = new Students("Sam", 95, 95);
    Students student2 = new Students("Jane", 76, 65);
    Students student3 = new Students("Tom", 34, 40);


    // the  method that let us choose the president looking to parameters, that every student have.
    public void choosePresidentOfTheGroup() {
        if (student1.getLevelOfSoftSkills() >= 90 && student1.getProgressInStuding() >= 90) {
            System.out.println(student1.getName() + " will be the president of our group ");
        } else if (student2.getLevelOfSoftSkills() >= 90 && student2.getProgressInStuding() >= 90) {
            System.out.println(student2.getName() + " will be the president of our group ");
        } else if (student3.getLevelOfSoftSkills() >= 90 && student3.getProgressInStuding() >= 90) {
            System.out.println(student3.getName() + " will be the president of our group ");
        }
    }
}
