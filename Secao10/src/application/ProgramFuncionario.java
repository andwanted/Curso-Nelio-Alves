package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Digite o numero de funcionarios: ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + "");
			System.out.print("Digite o id: ");
			Integer id = sc.nextInt();
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o salario: ");
			Double salario = sc.nextDouble();

			Funcionario func = new Funcionario(id, nome, salario);

			lista.add(func);

		}

		System.out.print("Digite o id que recebera o aumento: ");
		int idSalario = sc.nextInt();

		Integer pos = position(lista, idSalario);
		if (pos == null) {
			System.out.println("id não encontrado");
		} else {
			System.out.println("encontrado");
			System.out.printf("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			lista.get(pos).aumentoSalario(porcentagem);
		}

		for (Funcionario listagem : lista) {
			System.out.println(listagem);
		}

		sc.close();
	}

	public static Integer position(List<Funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
