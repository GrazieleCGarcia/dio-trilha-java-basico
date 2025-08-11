/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // Solicitar e ler número da agência
        System.out.println("Por favor, digite o numero da Agência:");
        String agencia = scanner.nextLine();

        // Solicitar e ler nome do cliente
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler saldo
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Montar mensagem final usando concatenação
        String mensagem = "Olá " + nomeCliente 
                + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero 
                + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibir mensagem
        System.out.println(mensagem);

        // Fechar Scanner
        scanner.close();
    }
}
