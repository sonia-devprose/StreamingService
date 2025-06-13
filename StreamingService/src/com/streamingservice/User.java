
package com.streamingservice;
import java.util.*;
public class User {

    private String userId;
    private String name;
    List<Content> watchHistory = new ArrayList<>();
public User (String userId, String name ) {
    this.userId = userId;
    this.name = name;
}
    public void watch(Content content) {
        content.play();
        watchHistory.add(content);
    }

    public void displayHistory() {
        System.out.println("\nWatch history for " + name + ":");
        for (Content item : watchHistory) {
            item.displayDetails();
            System.out.println("-----");
        }
    }
}
