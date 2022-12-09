
package com.jpcorporation.projetocrudjsfprimefaces.medicamento.controller;

import com.jpcorporation.projetocrudjsfprimefaces.medicamento.model.Medicamento;
import com.jpcorporation.projetocrudjsfprimefaces.medicamento.service.MedicamentoService;
import com.jpcorporation.projetocrudjsfprimefaces.medicamento.utils.ErroException;
import com.jpcorporation.projetocrudjsfprimefaces.medicamento.utils.Message;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class MedicamentoMB implements Serializable {
    
    @Inject
    private Medicamento medicamento;
    
    @Inject
    private MedicamentoService service;
    
    private List<Medicamento> listaMedicamentos;
    
    //Ele vai ser construido assim que a classe for criada
    @PostConstruct
    public void carregar(){
        listaMedicamentos = service.listaDeMedicamentos();
    }
    
    public void adicionar(){
        try {
            
            service.salvar(medicamento);
            medicamento = new Medicamento();
            carregar();
            Message.info("Salvo com Sucesso");
            } catch (ErroException e) {
                Message.erro(e.getMessage());
            }
    }
    
    public void excluir(){
        try {
            
            service.remover(medicamento);
            carregar();
            Message.info(medicamento.getName() + " Foi Removido");
            
        } catch(Exception e){
            System.out.println("ERRO");
        }
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public List<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }
    
    
    
}
