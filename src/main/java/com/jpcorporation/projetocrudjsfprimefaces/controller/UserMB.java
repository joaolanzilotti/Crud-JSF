
package com.jpcorporation.projetocrudjsfprimefaces.controller;

import com.jpcorporation.projetocrudjsfprimefaces.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class UserMB implements Serializable{
    
    @Inject
    private User user;
    
    private List<User> listUsers = new ArrayList<>();
    
    public String addUser(){
        listUsers.add(user);
        limpar();
    return "pages/sucesso";
    }
    
    private void limpar(){
        user = new User();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    
    
}
