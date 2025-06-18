package br.dev.breno.tarefas.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import br.dev.breno.tarefas.pastas.Pastas;
import br.dev.breno.tarefas.model.Funcionario;

public class FuncionarioDAO {
    private String arquivo = "C:\\Users\\breno\\Desktop\\tarefasDS1TA\\tarefas.txt";

    private Funcionario funcionario;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;

    public FuncionarioDAO(Funcionario funcionario) throws FileNotFoundException {
        this.funcionario = funcionario;
        try {
            fw = new FileWriter(arquivo, true);
            bw = new BufferedWriter(fw);
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public void salvar(){
        try {
            bw.write(funcionario.toString());
            bw.flush();
            System.out.println(funcionario.getNome() + " gravado com sucelso!");
        }catch (IOException e){
            e.printStackTrace();
        }


    }




}
