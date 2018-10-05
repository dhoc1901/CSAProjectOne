
/**
 * Write a description of class Movie here.
 *
 * @author David H
 * @version 9/14/18
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
    }
    public void setTitle(String t) {
        title =t;
    }
    public String getTitle() {
        return title;
    }
    public void setRating(int t) {
        rating =t;
    }
    public int getRating() {
        return rating;
    }
    public void setDuration(int t) {
        duration = t;
    }
    public int getDuration() {
        return duration;
    }
    public Movie(String title, int duration, int rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }
}
