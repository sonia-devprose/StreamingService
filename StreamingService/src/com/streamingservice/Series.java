package com.streamingservice;

public class Series extends Content{

    private int seasons;
    private int episodePerSeason;
    public Series(String id, String title, int releaseYear, String genre, int seasons, int episodePerSeason)
    {
        super(id, title, releaseYear, genre);
        this.seasons = seasons;
        this.episodePerSeason = episodePerSeason;
    }

    @Override
    public void play()
    {
        System.out.println("The series to be played is: " + getTitle());
    }
    @Override
    public int getDuration()
    {
        return seasons * episodePerSeason * 45; //avg 45 mins per episode
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Seasons: " + seasons);
        System.out.println("Episodes: " + episodePerSeason);
    }

}
