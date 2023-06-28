/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Projeto;
import servicos.AlunoServicos;
import servicos.ServicosFactory;
/**
 *
 * @author 631610260
 */
public class ProjetoDAO {
    public void cadastrarProjetoDAO(Projeto pVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into projetos values (null, ?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getEixoTec());
            pst.setDate(2, (Date) pVO.getDataInicio());
            pst.setDate(3, (Date) pVO.getDataFim());
            pst.setInt(4, pVO.getnIntegrantes());
            pst.setInt(5, pVO.getIdProjeto());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Projeto.\n"
                    + e.getMessage());
        }
    }
    public ArrayList<Projeto> getProjetos() {
        ArrayList<Projeto> projetos = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from projetos";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Projeto p = new Projeto();
                p.setEixoTec(rs.getString("eixoTec"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataFim(rs.getDate("dataFim"));
                p.setnIntegrantes(rs.getInt("nIntegrantes"));
                p.setIdProjeto(rs.getInt("idProjeto"));
                AlunoServicos alunoS = ServicosFactory.getAlunoServicos();
                projetos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Projetos.\n"
                    + e.getMessage());
        }

        return projetos;
    }
    public Projeto getProjetoByDoc(String idProjeto) {
        Projeto p = new Projeto();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from projetos"
                    + " where idProjeto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idProjeto);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                p.setEixoTec(rs.getString("eixoTec"));
                p.setDataInicio(rs.getDate("dataInicio"));
                p.setDataFim(rs.getDate("dataFim"));
                p.setnIntegrantes(rs.getInt("nIntegrantes"));
                p.setIdProjeto(rs.getInt("idProjeto"));
                AlunoServicos alunoS = ServicosFactory.getAlunoServicos();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar projeto.\n" + e.getMessage());
        }
        return p;
    }
    public void atualizarProjeto(Projeto pVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update projetos set nIntegrantes = ?, EixoTec = ?, "
                    + " where idProjeto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, pVO.getnIntegrantes());
            pst.setString(2, pVO.getEixoTec());
            AlunoServicos alunoS = ServicosFactory.getAlunoServicos();
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar projeto.\n" + e.getMessage());
        }
    }
    public void deletarProjeto(String idProjeto){
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from projetos where idProjetos = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idProjeto);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar projeto.\n" + e.getMessage());
        }
    }
}
