package org.example.entities;

public class Course {
    private String name;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", media=" + media +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    private Media media;

    public  void createCourse(){
        Course course101 = new Course();
        course101.setName("Beginner course ");
        Media media1 = new Media();
        System.out.println("This is my first course : "+course101.getName());
        media1.addMedia();
    }

}
