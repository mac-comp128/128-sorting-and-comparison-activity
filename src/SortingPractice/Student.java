package SortingPractice;

/**
 * The Student class keeps track of the following pieces of data
 * about a student: the student's name, ID number, the number of
 * credits the student has earned toward graduation, and whether
 * the student is paid up with respect to university bills.
 * All of this information is entirely private to the class.
 * Clients can obtain this data only by using the various methods
 * defined by the class.
 */

public class Student {
    /* Private instance variables */
    private String studentFirstName;   /* The student's first name */
    private String studentLastName;   /* The student's first name */
    private int studentID;        /* The student's ID number      */

	/* Public constants */

    /** The number of credits required for graduation */
    public static final double CREDITS_TO_GRADUATE = 128.0;

    /**
     * Creates a new Student object with the specified name and ID.
     * @param fname The student's first name as a String
     * @param lname The student's first name as a String
     * @param id The student's ID number as an int
     */
    public Student(String fname, String lname, int id) {
        studentFirstName = fname;
        studentLastName = lname;
        studentID = id;
    }

    /**
     * Gets the name of this student.
     * @return The name of this student
     */
    public String getName() {
        return studentFirstName + " " + studentLastName;
    }
    /**
     * Gets the first name of this student.
     * @return The first name of this student
     */
    public String getFirstName() {
        return studentFirstName;
    }

    /**
     * Gets the last name of this student.
     * @return The last name of this student
     */
    public String getLastName() {
        return studentLastName;
    }

    /**
     * Gets the ID number of this student.
     * @return The ID number of this student
     */
    public int getID() {
        return studentID;
    }

    /**
     * Creates a string identifying this student.
     * @return The string used to display this student
     */
    @Override
    public String toString() {
        return getName() + " (#" + getID() + ")";
    }

    /**
     * Instances of Student objects are considered equal if they
     * have exactly the same name string and the same student ID.
     *
     * @param other Student object instance to compare to this one
     *
     * @return true if this instance of Student has the same name
     *          and student ID as the instance called other;
     *          false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other != null && other instanceof Student) {
            Student that = (Student) other;
            result = ((getName().equals(that.getName())) &&
                    (getID() == that.getID()));
        }
        return result;
    }
}
