
/**
 * Write a description of class Song here.
 *
 * @author David H
 * @version 9/14/18
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    /**
     * Constructor for objects of class Song
     */
    public Song()
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
