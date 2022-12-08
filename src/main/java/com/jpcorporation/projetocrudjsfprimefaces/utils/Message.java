
package com.jpcorporation.projetocrudjsfprimefaces.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class Message {
    
    public static void info(String mensagem){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public static void erro(String mensagem){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public static void warning(String mensagem){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN,mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
