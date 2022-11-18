public class Personne extends EPFLien{

    private String labo;
    public int salaire;

    public Personne(String nom, int annee, String labo, int salaire){
        super(nom, annee);
        this.labo = labo;
        this.salaire = salaire;
    }

    public String getLabo() {
        return labo;
    }

    public int getSalaire() {
        return salaire;
    }

}
