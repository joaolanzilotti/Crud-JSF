
package com.jpcorporation.projetocrudjsfprimefaces.controller;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Named
@SessionScoped
public class TimesMB implements Serializable{
    
    private List<String> timesEspanhois;
    
    public void selecionar(){
        for (String times : timesEspanhois) {
            System.out.println(times);
        }
    }
    
}
