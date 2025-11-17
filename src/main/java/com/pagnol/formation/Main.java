package src.main.java.com.pagnol.formation;

public class Main {
    public static void testMethode(int a, int b,Operation op){
        var result = op.appliquer(a,b);
        System.out.println("la somme des deux est : "+result);
    }
    public static void main(String[] args) {
        System.out.println("je proclame reussite sur ma vie");
        testMethode(4,5,new Operation(){
            @Override
        public int appliquer(int a, int b) {
                return a+b;
            }});

        //avec lamda
        testMethode(10,10,(a,b)->{return a+b;});


    }

}