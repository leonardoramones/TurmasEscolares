/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Projeto {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
    private int IdProjeto;
    private String eixoTec;
    private Date dataInicio;
    private Date dataFim;
    private int nIntegrantes;
    
    public Projeto(){        
    }

    public Projeto(String eixoTec, Date dataInicio, Date dataFim, int nIntegrantes, int IdProjeto) {
        this.eixoTec = eixoTec;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nIntegrantes = nIntegrantes;
        this.IdProjeto = IdProjeto;
    }

    public String getEixoTec() {
        return eixoTec;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public int getnIntegrantes() {
        return nIntegrantes;
    }

    public int getIdProjeto() {
        return IdProjeto;
    }
    

    public void setEixoTec(String eixoTec) {
        this.eixoTec = eixoTec;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setnIntegrantes(int nIntegrantes) {
        this.nIntegrantes = nIntegrantes;
    }

    public void setIdProjeto(int IdProjeto) {
        this.IdProjeto = IdProjeto;
    }
    

    @Override
    public String toString() {
        return "\n--Projeto--" + "\nEixo téc.:"+ "\t" + eixoTec + "\nData inicio:\t" + dataInicio + "\nData fim:\t" + dataFim + "\nnIntegrantes:\t" + nIntegrantes + "\nIdProjeto:\t" + IdProjeto + '}';
    }
    
}
