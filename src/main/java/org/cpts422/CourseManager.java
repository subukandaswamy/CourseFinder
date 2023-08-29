package org.cpts422;

public interface CourseManager {

    public void add(Course course);

    public Course[] findall();

    public Course[] findByInstructor(String courseInstructor);
}
