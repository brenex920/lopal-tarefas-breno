package br.dev.breno.tarefas.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.breno.tarefas.model.Funcionario;
import br.dev.breno.tarefas.pastas.Pastas;

public class FuncionarioDAO {
	
	private Funcionario funcionario;

	public FuncionarioDAO() {

	}

	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void gravar() {
		try {
			Pastas ff = new Pastas();
			ff.getBufferedReader().write(funcionario.toString());
			ff.getBufferedReader().flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Funcionario> listar() {

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		try {
			Pastas ff = new Pastas();
			BufferedReader br = ff.getBufferedReader();

			String linha = "";

			br.readLine();

			while (linha != null) {
				// Extraído uma linha do arquivo
				linha = br.readLine();

				// Cria um vetor
				if (linha != null) {
					String funcioarioStr[] = linha.split(",");

					// Criando um objeto funcionario
					Funcionario funcionario = new Funcionario();
					funcionario.setMatricula(funcioarioStr[0]);
					funcionario.setNome(funcioarioStr[1]);
					funcionario.setCargo(funcioarioStr[2]);
					funcionario.setSetor(Double.parseDouble(funcioarioStr[3]));

					funcionarios.add(funcionario);

				}

			}

			return funcionarios;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

    