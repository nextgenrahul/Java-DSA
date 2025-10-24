package Practice;
public class PremiumMovie extends Movie {
    private boolean has3D;
    
    public PremiumMovie(String title, String genre, int duration, boolean has3D) {
        super(title, genre, duration); 
        this.has3D = has3D;
    }
    
    public void showPremiumDetails() {
        showDetails();
        System.out.println("3D Feature: " + (has3D ? "Yes" : "No"));
    }
    
}
