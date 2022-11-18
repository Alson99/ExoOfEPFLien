public class Enseignat extends Personne{
    private String section;

    public Enseignat(String nom, int annee, String labo, int salaire, String section){
        super(nom, annee, labo, salaire);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void afficher(){
        System.out.println(" Enseignants:");
        super.afficher();
        System.out.println(" Section d'enseignement: " + getSection());
    }
}
