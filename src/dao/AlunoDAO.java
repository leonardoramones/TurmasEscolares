/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
/**
 *
 * @author 631610260
 */
public class AlunoDAO {
    public void cadastrarAlunoDAO(Aluno aVO) {
        try {
            //buscar conexão com BD
            Connection con = Conexao.getConexao();
            //criar script sql de insert
            String sql = "insert into alunos values (null, ?,?,?,?)";
            //criar espaço para executar script
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getNome());
            pst.setString(2, aVO.getMatricula());
            pst.setString(3, aVO.getTurma());
            pst.setString(4, aVO.getProjeto());
            
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Aluno.\n"
                    + e.getMessage());
        }
}
    //método para listar todos alunos
    public ArrayList<Aluno> getAlunos(){
        ArrayList<Aluno> alunos = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from alunos";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Aluno a = new Aluno();
                // lado do java |x| lado do banco
                a.setIdAluno(rs.getInt("idAluno"));
                a.setNome(rs.getString("nome"));
                a.setMatricula(rs.getString("matricula"));
                a.setTurma(rs.getString("turma"));
                a.setProjeto(rs.getString("projeto"));
                alunos.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar alunos.\n"
                    + e.getMessage());
        }
        return alunos;
    }
    //método para listar UM aluno
    public Aluno getAlunoByDoc(String matricula){
        Aluno a = new Aluno();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from alunos where matricula = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, matricula);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                // lado do java |x| lado do banco
                a.setIdAluno(rs.getInt("idAluno"));
                a.setNome(rs.getString("nome"));
                a.setMatricula(rs.getString("matricula"));
                a.setTurma(rs.getString("turma"));
                a.setProjeto(rs.getString("projeto"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar matrícula.\n"
                    + e.getMessage());
        }
        return a;
    }
    
    public void atualizarAlunoDAO(Aluno aVO){
        try {
            Connection con = Conexao.getConexao();
            String sql = "update alunos set nome = ?, turma = ?, projeto = ?"
                    + " where matricula = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getNome());
            pst.setString(4, aVO.getMatricula());
            pst.setString(2, aVO.getTurma());
            pst.setString(3, aVO.getProjeto());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Aluno.\n"
                    + e.getMessage());
        }
    }
    public void deletarAlunoDAO(String matricula){
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from alunos where matricula = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, matricula);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar Aluno.\n"
                    + e.getMessage());
        }
    }
    public int getIdLast () {
        int id = 0;
        try {
            Connection con = Conexao.getConexao();
            String sql = "select max(idAluno) as IdLast from alunos;";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                // lado do java |x| lado do banco
                id = rs.getInt("idLast");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar id.\n"
                    + e.getMessage());
        }
        return id;
    }
}
