import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        /*
        Crie um programa que solicite ao usuário que insira dois números inteiros e depois imprima a soma deles.
         */
        int[] numeros = new int[2];

        numeros[0] = 1;
       numeros[1] = 2;

       int soma = numeros[0] + numeros[1];

        System.out.println("Soma entre os numeros: " + numeros[0] + " + " + numeros[1] + " = " + soma);

        System.out.println("--------------------------------------------------------------------");

       /*
        Escreva um programa que determine se um número dado é primo ou não.
         */


        System.out.print("Digite um número positivo, acima de 1: ");
        int numeroDigitado = leitura.nextInt();

        if(isPrimo(numeroDigitado)){
            System.out.println("O número informado " + numeroDigitado + " é primo!!");
        }else{
            System.out.println("O numero informado " + numeroDigitado + " não é primo!!!");
        }



        System.out.println("--------------------------------------------------------------------");

        /*
        Implemente um programa que receba uma string do usuário e conte o número de vogais presentes nela.
         */
        int contadorVogais = 0; //declaro um contador de vogais.

        System.out.print("Digite uma String: "); //peço um input do usuario.

        String texto;
        texto = leitura.next();

        char[] vogais = {'a','e','i','o','u'}; //declaro um vetor de caracteres.

        for(int i = 0; i < texto.length();i++) { //faço um for para iterar sobre os caracteres do texto.
            if(isVogal(texto.charAt(i),vogais)){
                contadorVogais++;
            }
        }
        System.out.println("A string digitada contém: " + contadorVogais + " vogais presentes nela.");


        System.out.println("--------------------------------------------------------------------");

        /*
        Desenvolva um programa que inverta uma string fornecida pelo usuário sem usar métodos prontos de reversão.
         */

        String radio = "Radio";

        int tamanho = radio.length();

        for (int i = tamanho - 1; i >= 0 ; i--){
            System.out.print(radio.charAt(i));
        }
        System.out.println("--------------------------------------------------------------------");



        /*
        Crie um programa que solicite ao usuário que insira um número inteiro e,
         em seguida, verifique se esse número é um palíndromo (ou seja, se ele permanece o mesmo quando lido de trás para frente).
         */

        System.out.print("Digite um número: ");

        int numero4 = leitura.nextInt();

        if (isPalindromo(numero4)) System.out.println("Palindromo!");
        System.out.println("--------------------------------------------------------------------");


        /*
        Faça um programa que receba um número inteiro do usuário e imprima todos os números primos menores ou iguais a esse número.
         */

        System.out.print("Digite um número inteiro, positivo: ");
        int numero44 = leitura.nextInt();

            while(numero44 <= 0) {
                System.out.print("Digite um número positivo, maior que zero: ");
                numero44 = leitura.nextInt();
            }

            for(int i = numero44 - 1; i >= 0;i--){
                if(i != 0) {
                    System.out.print(i + ",");
                }else{
                    System.out.print(i + "");
                }
            }


        System.out.println("--------------------------------------------------------------------");

      /*
      Implemente um programa que calcule e imprima o fatorial de um número inteiro fornecido pelo usuário.
       */
        System.out.print("Digite um número inteiro positivo, maior que zero: ");
       int digitadonumero = leitura.nextInt();

        System.out.println("O fatorial de " + digitadonumero + " é " + fatorial(digitadonumero));
        System.out.println("--------------------------------------------------------------------");


        /*
        Escreva um programa que receba um array de inteiros do usuário e determine o maior e o menor elemento desse array.
         */
        int tamanho2 = 10;
        Integer[] vetor = new Integer[tamanho2];

        for(int i = 0; i < tamanho2 ; i++){
            vetor[i] = leitura.nextInt();
        }

        int comparador = vetor[0];

        for(int i = 0;i < tamanho2 - 1;i++){
            if(comparador > vetor[i + 1]){
                comparador = vetor[i + 1];
            }
        }
        System.out.println(comparador);
        leitura.close();



 }

    public static boolean isVogal(char c,char[] vogais) {
        for(char vogal : vogais){
            if(c == vogal){
                return true;
            }
        }
        return false;
    }

    public static boolean isPrimo(int numero){
        if(numero <= 1){
            return false;
        }else{
            for(int i = 2;i <= numero / 2;i++){
                if(numero % i == 0){
                    return false;
            }
        }
    }
        return true;
}

    public static boolean isPalindromo(int numero){
        String original = Integer.toString(numero);
        String invertida = "";

        for(int i = original.length() - 1 ; i >= 0 ; i--) {
            invertida += original.charAt(i);
        }
        return invertida.equals(original);
    }

    public static int fatorial(int numero){
        Scanner leitura = new Scanner(System.in);
        while(numero <= 0){
            System.out.println("Só será aceito números maiores que zero!");
            numero = leitura.nextInt();
        }
        for(int i = numero - 1;i >= 1;i--){
            numero *= i;
        }
        return numero;
    }


}
