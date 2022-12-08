
package com.jpcorporation.projetocrudjsfprimefaces.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter
@Setter
public class ClienteMB implements Serializable{
    
    private String tipoPessoa = "FISICA";
    
}
