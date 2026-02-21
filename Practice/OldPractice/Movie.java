package Practice.OldPractice;
public class Movie {
    private String title;
    private String genre;
    private int duration;

    // Constructor
    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    public void check(){
        System.out.println("Hello i am static.");
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void showDetails() {
        System.out.println(title + " - " + genre + " - " + duration + " mins");
    }
}
