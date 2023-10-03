
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        Pessoas pessoa = new Pessoas();

        System.out.println("Qual seu Nome? ");
        String nome = sc.nextLine();
        System.out.println("Qual é a sua idade?");
        int idade = sc.nextInt();
        pessoa.Set_Nome(nome);
        pessoa.Set_Idade(idade);

        System.out.println("Olá " + pessoa.Get_Nome());
        System.out.println("Sua Idade é: " + pessoa.Get_Idade() + " Anos.");
    }

}
