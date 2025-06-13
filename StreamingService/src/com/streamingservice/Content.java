package com.streamingservice;

public abstract class Content implements Streamable{

    private String id;
    private String title;
    private int releaseYear;
    private String genre;

    // constructor
    public Content(String id, String title, int releaseYear, String genre)
    {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }
    // getter methods
    public String getId()
    {
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int getReleaseYear()
    {
        return releaseYear;
    }
    public String getGenre()
    {
        return genre;
    }

    @Override
   public void displayDetails()
{
    System.out.println("The ID of the movie is: " + getId());
    System.out.println("The title of the movie is: " + getTitle());
    System.out.println("The year of release for the movie is: " + getReleaseYear());
    System.out.println("The genre of the movie is: " + getGenre());
}

}
