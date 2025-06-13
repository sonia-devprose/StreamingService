package com.streamingservice;
// Interface for streamable content
public interface Streamable {
    // Method declarations - abstract methods that do not have a body and will be defined in the inherited classes
    void play();
    void displayDetails();
    int getDuration();
}
