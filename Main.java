import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;

     
        int voto;
        do {
            voto = s.nextInt(); 
            if (voto == 1) {
                cand1++;
            } else if (voto == 2) {
                cand2++;
            } else if (voto == 3) {
                cand3++;
            } else if (voto == 4) {
                votosNulos++;
            } else if (voto == 5) {
                votosBrancos++;
            }
        } while (voto >= 0); 
        System.out.println("Candidato 1 : " + cand1 + " voto(s)");
        System.out.println("Candidato 2 : " + cand2 + " voto(s)");
        System.out.println("Candidato 3 : " + cand3 + " voto(s)");
        System.out.println("Nulos : " + votosNulos + " voto(s)");
        System.out.println("Brancos : " + votosBrancos + " voto(s)");
    }
}
