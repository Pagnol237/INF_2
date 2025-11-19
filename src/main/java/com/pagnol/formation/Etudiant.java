package src.main.java.com.pagnol.formation;

public class Etudiant implements Comparable<Etudiant> {
    private String nom;
    private String prenom;
    private int age;

    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public String ToString(){
        return "nom: " + this.nom + ", this.prenom: " + prenom+ ", age: " + this.age;
    }
    @Override
    public int compareTo(Etudiant autre) {
        return this.nom.compareTo(autre.nom);
    }
}
