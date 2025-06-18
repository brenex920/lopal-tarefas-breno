package br.dev.breno.tarefas.pastas;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pastas {
	
	
	
	//senai
	private String arquivo = "/Users/25132475/Desktop/ProjetoDS1TA/funcionarios/funcionario.txt";
	private String arquivo2 = "/Users/25132475/Desktop/ProjetoDS1TA/tarefas/tarefa.txt";
	
	
	//casa
    //private String arquivo = "";
    //private String arquivo2 = "C:\\\\Users\\\\breno\\\\Desktop\\\\tarefasDS1TA\\\\tarefas.txt";

    private FileWriter fw;
    private BufferedReader br;
    private FileReader fr;
    private BufferedWriter bw;
    private FileWriter fw2;
	private BufferedWriter bw2;
	private FileReader fr2;
	private BufferedReader br2;

    public Pastas() throws IOException {
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);
        
        fr = new FileReader(arquivo);
		br = new BufferedReader(fr);
		
		fw2 = new FileWriter(arquivo2, true);
		bw2 = new BufferedWriter(fw2);
		
		
		fr2 = new FileReader(arquivo2);
		br2 = new BufferedReader(fr2);
    }
    

    public BufferedWriter getBw() {
        return bw;
    }
    public BufferedReader getBufferedReader() {
		return br;
	}
    public BufferedWriter getBufferedWriter2(){
		return bw2;
	}
	
	public BufferedReader getBufferedReader2() {
		return br2;
	}
}

