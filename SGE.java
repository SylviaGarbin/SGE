import java.util.Scanner;

public class SGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Gerenciamento de Estoque");
        System.out.println("");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("");

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println(sobrenome);
        System.out.println("");

        int contador = 0;

        String username = nome + sobrenome;
        System.out.println("Username: " + username.charAt(contador) + "_" + sobrenome);
        System.out.println("");

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();


       if ( senha.length()  < 8) {
          System.out.println("Senha precisa ter no minimo 8 caracteres");
       }


        boolean temCaracterEspecial = false;

        while(contador < senha.length()) {

            String caracter = String.valueOf(senha.charAt(contador));

            temCaracterEspecial = caracter.equals("@");


            if (temCaracterEspecial == true) {
                break;
            }

            contador++;
        }

        if (temCaracterEspecial == false) {
            System.out.println("Senha precisa ter um caracter especial");
        }

    }
}
