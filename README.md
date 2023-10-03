# ProjetoJavaRH

```java

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

public class Pessoas {
    private String nome;
    private int idade;
    
    
    public String Get_Nome() {
        return this.nome;
    }
    
     public String Set_Nome(String nome) {
        return this.nome = nome;
    }
     
    public int Get_Idade () {
        return this.idade;
    }
    
    public int Set_Idade (int idade) {
        return this.idade = idade;
    }
        
}

```
