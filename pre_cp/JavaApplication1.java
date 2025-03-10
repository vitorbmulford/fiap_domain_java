/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //        Random ale = new Random();
        //        int cont = 0, valor = 0;
        //        while (cont <= 20) {
        //            cont++;
        //            valor = ale.nextInt(1000, 1999);
        //            if (valor % 11 == 5) {
        //                System.out.println(valor);
        //            }
        //        }
        int op;
        String nome = "", endereco = "", email = "", telefone = "";
        do {
            System.out.println("1-Cadastrar\n2-Alterar\n3-Consultar\n4-Excluir\n5-Sair");
            op = x.nextInt();
            x.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Cadastro");
                    System.out.print("Nome: ");
                    nome = x.nextLine();
                    System.out.print("Nome cadastrado: " + nome + "\n");

                    System.out.print("Endereço: ");
                    endereco = x.nextLine();
                    System.out.print("Endereco cadastrado: " + endereco + "\n");

                    System.out.print("Email: ");
                    email = x.nextLine();
                    System.out.print("email cadastrado: " + email + "\n");

                    System.out.print("Telefone: ");
                    telefone = x.nextLine();
                    System.out.print("telefone cadastrado: " + telefone + "\n");

                    System.out.println("Cadastro realizado com sucesso!\n");
                    break;
                case 2:
                    int op2;

                    System.out.println("1-Nome\n2-Endereco\n3-email\n4-telefone\n5-Sair\n");
                    op2 = x.nextInt();
                    System.out.println("Alterar - Em desenvolvimento...");
                    x.nextLine();
                    switch (op2) {
                        case 1:
                            System.out.println("O nome: ");
                            nome = x.nextLine();
                            System.out.println("Nome alterado com sucesso: " + nome);
                            break;
                        case 2:
                            System.out.println("O endereco: " + endereco + "será alterado para: ");
                            endereco = x.nextLine();
                            System.out.println("Endereco alterado com sucesso: " + endereco);
                            break;
                        case 3:
                            System.out.println("O email: " + email + "será alterado para: ");
                            email = x.nextLine();
                            System.out.println("Endereco alterado com sucesso: " + email);
                            break;
                        case 4:
                            System.out.println("O telefone: " + telefone + "será alterado para: ");
                            telefone = x.nextLine();
                            System.out.println("Endereco alterado com sucesso: " + telefone);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Nome: " + nome);
                    System.out.println("Endereco: " + endereco);
                    System.out.println("Email: " + email);
                    System.out.println("Telefone: " + telefone);
                    break;
                case 4:
                    System.out.println("Excluindo os dados...");
                    nome = "";
                    endereco = "";
                    email = "";
                    telefone = "";
                    System.out.println("Todos os dados foram excluídos!\n");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (op != 5);

        x.close();
    }
}
