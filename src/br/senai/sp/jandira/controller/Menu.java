package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public void executarMenu() throws SQLException {
        boolean continuar = true;

        while (continuar){
            System.out.println("/------------------------/");
            System.out.println("/-        Bem Vindo     -/");
            System.out.println("/------------------------/");
            System.out.println("/-         Menu         -/");
            System.out.println("1- Cadastrar Funcionario  ");
            System.out.println("2- Listar Funcionarios    ");
            System.out.println("3- Deletar Funcionario    ");
            System.out.println("4- Pesquisar Funcionario  ");
            System.out.println("5- Atualizar Salario      ");
            System.out.println("6- Sair                   ");
            System.out.println("/------------------------/");

            Scanner scanner = new Scanner(System.in);

            int opcao = scanner.nextInt();
            scanner.nextLine();

            FuncionarioController funcionario = new FuncionarioController();

            switch (opcao){
                case 1:
                    Funcionario funcionario1 = new Funcionario();
                    funcionario1.cadastrarFuncionario();
                    funcionario.cadastrarFuncionario(funcionario1);
                    break;
                case 2:
                    funcionario.listarFuncionarios();
                    break;
                case 3:
                    System.out.println("Informe o nome que deseja deletar: ");
                    String nomeDelete = scanner.nextLine();
                    funcionario.deletarFuncionario(nomeDelete);
                    break;
                case 4:
                    System.out.println("Informe o nome que deseja pesquisar: ");
                    String nomePesquisado = scanner.nextLine();
                    funcionario.pesquisarFuncionario(nomePesquisado);
                    break;
                case 5:
                    System.out.println("Informe o nome que deseja atualizar: ");
                    String nomeSalario = scanner.nextLine();
                    System.out.println("Informe o novo Salario: ");
                    Double newSalario = scanner.nextDouble();
                    scanner.nextLine();

                    funcionario.atualizarSalario(nomeSalario, newSalario);

                    break;
                case 6:
                    continuar = false;
                    break;
            }
        }
    }
}
