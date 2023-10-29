import java.util.Random;

public class Dado {
     private int numeroFacce;
     private Random gen;

     public Dado() {
          numeroFacce = 6;
          gen = new Random();
     }

     public int lancia(){
          int result=gen.nextInt(numeroFacce)+1;
          return result;
     }

     public static void main(String[] args) {
          Dado d = new Dado();
          int risultato = d.lancia();
          System.out.println("E' USCITO IL NUMERO: " + risultato);
     }
}
