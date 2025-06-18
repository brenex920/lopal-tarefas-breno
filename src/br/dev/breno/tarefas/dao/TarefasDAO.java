package br.dev.breno.tarefas.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.breno.tarefas.model.Funcionario;
import br.dev.breno.tarefas.model.Tarefas;
import br.dev.breno.tarefas.pastas.Pastas;

public class TarefasDAO {
	private Tarefas tarefas;

	public TarefasDAO() {

	}

	public TarefasDAO(Tarefas tarefas) {
		this.tarefas = tarefas;
	}

	public void gravar() {
		try {
			Pastas ff = new Pastas();
			ff.getBufferedWriter2().write(tarefas.toString());
			ff.getBufferedWriter2().flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Tarefas> listar() {

		List<Tarefas> Tarefas = new ArrayList<Tarefas>();

		try {
			Pastas ff = new Pastas();
			BufferedReader br2 = ff.getBufferedReader2();

			String linha = "";

			br2.readLine();

			while (linha != null) {
				// Extraído uma linha do arquivo
				linha = br2.readLine();

				// Cria um vetor
				if (linha != null) {
					String tarefasStr[] = linha.split(",");

					// Criando um objeto Tarefas
					Tarefas tarefas = new Tarefas();
					tarefas.setCodigo(tarefasStr[0]);
					tarefas.setTitulo(tarefasStr[1]);
					tarefas.setDescricao(tarefasStr[2]);
					tarefas.setDataInc(tarefasStr[3]);
					tarefas.setPrazo(tarefasStr[4]);
					tarefas.setDataConclusao(tarefasStr[5]);
					tarefas.setStatus(tarefasStr[6]);
					tarefas.setResponsavel(tarefasStr[7]);
		

					Tarefas.add(tarefas);

				}

			}

			return Tarefas;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}