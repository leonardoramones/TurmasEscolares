/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 631610260
 */
public class Aluno {
    
    private int idAluno;
    private String nome;
    private String matricula;
    private String turma;
    private String projeto;
        
    
    
    public Aluno (){       
    }

    public Aluno(int idAluno, String nome, String matricula, String turma, String projeto) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.projeto = projeto;
    }

        
    public String getNome() {
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

     

   public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    

    @Override
    public String toString() {
        return "\n-- Aluno --" + "\nidAluno: \t" + idAluno + "\nNome: \t" + nome + "\nMatricula: \t" + matricula + "\nTurma: \t" + turma + "\nProjeto: \t" + projeto;
    }

    
    
}
