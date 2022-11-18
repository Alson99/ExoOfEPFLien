public class Direction {
    public static void main(String[] args) {
        Ecole epfl = new Ecole(5);
        epfl.add(new EtudiantRegulier("Brunel Ango", 2015, "IMM", 17.89));
        epfl.add(new EtudiantRegulier("Bernard Ondongo", 2019, "IMM", 17.89));
        epfl.add(new EtudiantEchange("Beni Malou", 2019, "IMM", "Congo"));
        epfl.add(new EtudiantRegulier("Alfred Matsou", 2019, "IMM", 17.89));
        epfl.add(new EtudiantEchange("Roy Matsou", 2019, "IMM", "Brazza"));
        epfl.afficherStatistiques();
        epfl.afficherEPFLien();
    }
}
