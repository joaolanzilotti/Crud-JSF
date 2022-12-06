
package com.jpcorporation.projetocrudjsfprimefaces.controller;

import com.jpcorporation.projetocrudjsfprimefaces.model.User;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UserMB implements Serializable{
    
    private User user;
    
}
