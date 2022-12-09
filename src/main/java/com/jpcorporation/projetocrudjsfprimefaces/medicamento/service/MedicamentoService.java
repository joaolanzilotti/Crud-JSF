package com.jpcorporation.projetocrudjsfprimefaces.medicamento.service;

import com.jpcorporation.projetocrudjsfprimefaces.medicamento.dao.DAO;
import com.jpcorporation.projetocrudjsfprimefaces.medicamento.model.Medicamento;
import com.jpcorporation.projetocrudjsfprimefaces.medicamento.utils.ErroException;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

public class MedicamentoService implements Serializable {
    
    @Inject
    private DAO<Medicamento> dao;
    
    public void salvar(Medicamento medicamento) throws ErroException{
        
        if(medicamento.getName().length() < 3){
            throw new ErroException("O nome do medicamento não pode ter menos que 3 caracteres");
        }
        
        dao.salvar(medicamento);
    }
    
    public void remover(Medicamento medicamento){
        dao.remover(Medicamento.class, medicamento.getId());
    }
    
    public List<Medicamento> listaDeMedicamentos(){
        return dao.buscarTodos("select m from Medicamento m order by m.name");
    }
    
}
