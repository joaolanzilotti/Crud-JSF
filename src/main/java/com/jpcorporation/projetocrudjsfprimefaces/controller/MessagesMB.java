
package com.jpcorporation.projetocrudjsfprimefaces.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class MessagesMB implements Serializable{
    
    public void salvar(){
        FacesMessage message = new FacesMessage("Mensagem de Sucesso");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void erro(){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Mensagem de erro", null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
