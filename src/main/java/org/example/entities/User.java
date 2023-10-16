package org.example.entities;

public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", courseTitle=" + courseTitle +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(Course courseTitle) {
        this.courseTitle = courseTitle;
    }

    private Course courseTitle;

    public void userCourseAndMedia(){
        User user = new User();
        Course course = new Course();
        course.createCourse();
        user.setName("Gadibia Daro ");
        user.setCourseTitle(course);
        System.out.println(" This is my user : "+ user);

    }
}
