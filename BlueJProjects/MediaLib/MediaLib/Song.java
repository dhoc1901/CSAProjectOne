
/**
 * Write a description of class Song here.
 *
 * @author David H
 * @version 9/24/18
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
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
    public void setPrice(double t) {
        price = t;
    }
    public double getPrice() {
        return price;   
    }
    public void addToFavorites() {
        favorite = true;
    }
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }   
}
