package br.dev.breno.tarefas.pastas;

import java.io.*;

public class Pastas {
    private String arquivo = "C:\\Users\\breno\\Desktop\\tarefasDS1TA\\tarefas.txt";


    private FileWriter fw;
    private BufferedReader br;
    private FileReader fr;
    private BufferedWriter bw;

    public Pastas() throws IOException {
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);
    }

    public BufferedWriter getBw() {
        return bw;
    }
}

