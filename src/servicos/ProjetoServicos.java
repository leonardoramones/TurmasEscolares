/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.ProjetoDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Projeto;
/**
 *
 * @author 631610260
 */
public class ProjetoServicos {
    public void cadastroProjeto(Projeto pVO) {
        ProjetoDAO pDAO = DAOFactory.getProjetoDAO();
        pDAO.cadastrarProjetoDAO(pVO);
    }

    public ArrayList<Projeto> getProjetos() {
        ProjetoDAO pDAO = DAOFactory.getProjetoDAO();
        return pDAO.getProjetos();
    }

    public Projeto getProjetoByDoc(String idProjeto) {
        ProjetoDAO pDAO = DAOFactory.getProjetoDAO();
        return pDAO.getProjetoByDoc(idProjeto);
    }

    public void atualizarProjeto(Projeto pVO) {
        ProjetoDAO pDAO = DAOFactory.getProjetoDAO();
        pDAO.atualizarProjeto(pVO);
    }

    public void deletarProjeto(String idProjeto) {
        ProjetoDAO pDAO = DAOFactory.getProjetoDAO();
        pDAO.deletarProjeto(idProjeto);
    }
}
