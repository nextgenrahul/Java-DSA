package Practice;
public class Main extends Movie {
    private boolean has3D;

    public Main(String title, String genre, int duration, Boolean has3D) {
        super(title, genre, duration);
        this.has3D = has3D;
    }
    
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Premium Features Available!");
        System.out.println("3D Feature: " + (has3D ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Movie movie1 = new Main("Inception", "Sci-Fi", 148, true);
        movie1.showDetails();
        movie1.check();
    }
     
    

}