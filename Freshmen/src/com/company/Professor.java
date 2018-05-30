package com.company;

import java.util.ArrayList;

public class Professor extends Group {

    // array where we will add some objects "student" to our "group"
    ArrayList<Students> group = new ArrayList<Students>();

    // method that allows us to do roll call
    public void rollCallOfTheGroup() {

        group.add(student1);
        group.add(student2);
        group.add(student3);

        // trying to do some roll call, knowing how many "students" should be in our  array "group"
        if (group.size() == 3) {
            System.out.println("Every one is present today");
        } else if (group.isEmpty()) {
            System.out.println("No one present today");
        } else if (group.size() < 3){
            System.out.println("Someone is absent today");
        }
    }


}
