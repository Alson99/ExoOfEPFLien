public class Etudiant extends EPFLien{
    private String section;

    public Etudiant(String nom, int annee, String section){
        super(nom, annee);
        this.section = section;
    }

    public void afficher(){
        super.afficher();
        System.out.println(" Section : " + getSection());
    }

    private String getSection() {
        return section;
    }

    public boolean isStudent(){
        return true;
    }
}
