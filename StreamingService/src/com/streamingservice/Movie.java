package com.streamingservice;

public class Movie extends Content{

        private String director;
        private int duration;
        public Movie(String id, String title, int releaseYear, String genre, String director, int duration)
        {
            super(id, title, releaseYear, genre);
            this.director = director;
            this.duration = duration;

        }
        @Override
        public void  play(){
            System.out.println("Playing movie: " + getTitle());
        }
        @Override
    public int getDuration()
        {
            return duration;
        }
        public String getDirector(){
            return director;
        }

        @Override
    public void displayDetails(){
            super.displayDetails();
            System.out.println("The director of the movie: " + getDirector());
            System.out.println("The duration of the movie: " + getDirector());

        }
}
