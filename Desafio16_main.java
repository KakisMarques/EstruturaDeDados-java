import java.util.Scanner;

public class Desafio16_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = in.nextInt();
        System.out.println("Digite a quantidade de anos que você fumou: ");
        int anosFumando = in.nextInt();
        int minutosPorDia = cigarrosPorDia * 10;
        int DiasEmAnos = anosFumando * 365;
        int minutosPerdidos = minutosPorDia * DiasEmAnos;
        int diasPerdidos = minutosPerdidos / 1440; 

        System.out.println("1 cigarro equivale a -10 minutos de vida.\nNesse ritmo você já perdeu " + diasPerdidos + " dias de vida.");
        in.close();
    }
}
