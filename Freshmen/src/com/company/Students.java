package com.company;

public class Students {
    // variables that we will use for our "students"
    private String name;
    private int progressInStuding;
    private int levelOfSoftSkills;

    /**
     *
     * @param name
     * @param progressInStuding
     * @param levelOfSoftSkills
     * @see Students#Students(String, int, int)
     */

    // constructor for objects of the Students class
    public Students(String name, int progressInStuding, int levelOfSoftSkills) {
        this.name = name;
        this.progressInStuding = progressInStuding;
        this.levelOfSoftSkills = levelOfSoftSkills;

        /**receiving value of variables name, progressInStuding and levelOfSoftSkills
         * which can be obtained using the method {@link #getName()}
         * @see Students#Students(String, int, int)
         * @param name
         * @param progressInStuding
         * @param levelOfSoftSkills
         */
    }

    // getters for access from other classes
    public String getName() {
        return name;
    }

    public int getProgressInStuding() {
        return progressInStuding;
    }

    public int getLevelOfSoftSkills() {
        return levelOfSoftSkills;
    }
}
