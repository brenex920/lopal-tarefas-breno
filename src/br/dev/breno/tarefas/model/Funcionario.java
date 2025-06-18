package br.dev.breno.tarefas.model;


import br.dev.breno.tarefas.utils.Utils;

public class Funcionario {

private String nome;
private String cargo;
private String matricula;
private String setor;


    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = Utils.gerarUUID8();
    }
    public Funcionario(String nome) {
        this.nome = nome;
        this.matricula = Utils.gerarUUID8();
    }

    public Funcionario(){
        this.matricula = Utils.gerarUUID8();
    }

  public String getNome(){
        return nome;
  }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getSetor(){
        return setor;
    }
    public void setSetor(double d) {
        this.setor = d;
    }
    @Override
    public String toString() {

        String funcionario = matricula +  ", " + nome + ", "  + cargo + ", " + setor + "\n";
        return funcionario;
    }
}
