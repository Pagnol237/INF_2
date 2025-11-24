package src.main.java.com.pagnol.formation;

public class Boite <T>{
    private T element;
    public Boite (T element){
        this.element = element;
    }

    public void setElement(T element){
        this.element = element;
    }
    public T getElement(){
        return this.element;
    }
     public static void afficheBoite(Boite<?> e){
        System.out.println(e.getElement());
     }
}
