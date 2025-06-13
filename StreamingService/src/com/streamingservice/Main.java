package com.streamingservice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Content[] library = {new Movie("M001", "Inception", 2010, "Sci-Fi", "Christopher Nolan", 148),
                        new Series("S001", "Stranger Things", 2016, "Horror", 4, 8),
                        new Movie("M002", "The Social Network", 2010, "Drama", "David Fincher", 120),
                        new Series("S002", "The Crown", 2016, "Historical", 5, 10)};

System.out.println("----Content library-----");
for(Content item : library)
{
    item.displayDetails();
}
// User interaction
        User user = new User("12345ABC", "John Doe");
System.out.println("Simulating streaming");
user.watch(library[0]);
        user.watch(library[1]);

        user.displayHistory();

        // Search functionality
        String searchId = "S001";
        boolean found = false;
        for (Content item : library)
        {
            if (item.getId().equals(searchId))
            {
                System.out.println("Found matching");
                found = true;
                break;
            }

            else {
                System.out.println("No matching found");
            }
        }




    }
}