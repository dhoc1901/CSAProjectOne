
/**
 * Write a description of class MediaLib here.
 *
 * @author David H
 * @version 9/14/18
 */
public class MediaLib
{
    public static void main() 
    {System.out.println("Welcome to your Media Library");
    Song song1 = new Song();
    Book book1 = new Book();
    Movie movie1 = new Movie();
    System.out.println(song1);
    song1.setTitle("Johnny B. Goode");
    System.out.println(song1.getTitle());
    System.out.println(book1);
    book1.setTitle("Foundation");
    System.out.println(book1.getTitle());
    System.out.println(movie1);
    movie1.setTitle("Pirates of the Carribean");
    System.out.println(movie1.getTitle());
}
}
