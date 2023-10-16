package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Media {
    private String name;

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", mediaList=" + mediaList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    private List<Media> mediaList;
    public void addMedia(){
        List<Media> listOfVideo = new ArrayList<>();
        Media media = new Media();
        media.setName("100 level video");
        Media media1 = new Media();
        media1.setName("200 level video");
        listOfVideo.add(media1);
        listOfVideo.add(media);

        System.out.println("These are the videos for this media : "+listOfVideo);
    }
}
