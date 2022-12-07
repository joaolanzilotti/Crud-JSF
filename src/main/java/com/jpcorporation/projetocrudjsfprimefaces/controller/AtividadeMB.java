
package com.jpcorporation.projetocrudjsfprimefaces.controller;

import com.jpcorporation.projetocrudjsfprimefaces.model.Atividade;
import com.jpcorporation.projetocrudjsfprimefaces.model.TipoAtividade;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class AtividadeMB implements Serializable{
    
    @Inject
    private Atividade atividade;
    
    public TipoAtividade[] getAtividades(){
        return TipoAtividade.values();
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
    
    
}
