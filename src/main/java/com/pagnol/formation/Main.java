package src.main.java.com.pagnol.formation;

/*
Exercice 1 : Boîte générique

Crée une classe générique Boite<T> qui peut contenir un objet de type T.

Ajoute une méthode pour mettre un objet dans la boîte.

Ajoute une méthode pour récupérer l’objet.

Écris une méthode afficherBoite qui accepte n’importe quelle boîte (Boite<?>) et affiche son contenu.

Question :

Teste afficherBoite avec une Boite<String> et une Boite<Integer>.

*/
public class Main {
    public static void main(String[] args) {
        Boite<String> boite1 = new Boite<>("bonjour");
        boite1.setElement("bonsoir");
        Boite.afficheBoite(boite1);
    }
}