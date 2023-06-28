/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author 631610260
 */
public class DAOFactory {
    private static AlunoDAO aDAO = new AlunoDAO();
    private static ProjetoDAO pDAO = new ProjetoDAO();

    public static AlunoDAO getAlunoDAO() {
        return aDAO;
    }
    public static ProjetoDAO getProjetoDAO() {
        return pDAO;
    }
}
