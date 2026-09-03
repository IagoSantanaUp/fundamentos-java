package logica_programacao.modulo01;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        //Exercicio 01 - Normalizador de nome de usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name");
        } else {
            String newString = name.trim().toLowerCase();
            name = newString;
        }

        System.out.println(name);

        //Exercicio 02 - Validador e classificador de senha
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String password = scanner.nextLine();

        boolean temMaiusculas = false;
        boolean temMinusculas = false;
        boolean temNumero = false;

        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                temMaiusculas = true;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++){
            if (Character.isLowerCase(password.charAt(i))){
                temMinusculas = true;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                temNumero = true;
                break;
            }
        }

        if (password == null || password.length() < 8 || password.isBlank() || !temMaiusculas || !temMinusculas || !temNumero){
            throw new IllegalArgumentException("Password invalid");
        } else {
            System.out.println(true);
        }

    }
}
