package org.cpts422;

public class Main {

    private static CourseLister courseLister;

    public static void assemble(){
        CourseManager manager = new MapCourseManagerImpl();
        courseLister = new CourseLister(manager);
    }


    public static void main(String[] args) {

        assemble();
        System.out.println("All Courses:");
        courseLister.displayAllCourses();
        if(args.length >0){
            System.out.println("Courses for Instructor: " + args[0]);
            courseLister.displayCoursesByInstructor(args[0]);
        }

    }
}