
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
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
    }
        public void setTitle(String t) {
        title =t;
    }
    public String getTitle() {
        return title;
    }

}
