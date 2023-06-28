/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author 181920026
 */
public class ServicosFactory {
    private static AlunoServicos alunoS = new AlunoServicos();
    private static ProjetoServicos projetoS = new ProjetoServicos();

    public static AlunoServicos getAlunoServicos() {
        return alunoS;
    }

    public static ProjetoServicos getProjetoServicos() {
        return projetoS;
    }
}
