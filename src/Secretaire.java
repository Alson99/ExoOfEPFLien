public class Secretaire extends Personne{
    public Secretaire (String nom, int annee, int salaire, String labo){
        super(nom, annee, labo, salaire);
    }
    public void afficher(){
        System.out.println("Secretaire");
        super.afficher();
    }
}
