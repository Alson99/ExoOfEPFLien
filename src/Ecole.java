import java.util.ArrayList;
import java.util.Calendar;

public class Ecole {
    private ArrayList<EPFLien> gens;

    public Ecole(int nbPersonnes){
        gens = new ArrayList<EPFLien>();
    }

    public void add(EPFLien personne){
        if (personne != null){
            gens.add(personne);
        }
    }

    public void afficherStatistiques() {
        int anneeCourante = Calendar.getInstance().get(Calendar.YEAR);
        int nbAnneesTotal = 0;
        int nbEtudiants = 0;
        for (EPFLien epfLien : gens ){
            nbAnneesTotal = nbAnneesTotal + (anneeCourante - epfLien.getAnnee());
            if (epfLien.isStudent()){
                ++nbEtudiants;
            }
        }
        System.out.println(" Parmi les " + gens.size() + " EPFLiens, " +
                nbEtudiants + " sont des etudiants.");
        double moyen = nbAnneesTotal;
        moyen /= gens.size();
        System.out.println("Ils sont ici depuis en moyenne " + moyen + " ans");
    }

    public void afficherEPFLien(){
        System.out.println("Liste des EPFLiens: ");
        for (EPFLien epfLien : gens)
            epfLien.afficher();
    }
}
