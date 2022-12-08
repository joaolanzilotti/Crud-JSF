
package com.jpcorporation.projetocrudjsfprimefaces.dao;

import com.jpcorporation.projetocrudjsfprimefaces.medicamento.model.Base;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class DAO<T extends Base>implements Serializable{
    
    private static EntityManager manager = ConnectionFactory.getEntityManager();
    
    public T buscarPorId(Class<T>Class, Long id){
        return manager.find(Class, id);
    }
    
    public void salvar(T t){
        try{
            manager.getTransaction().begin();
            
            if(t.getId() == null){
                manager.persist(t);
            }else{
                //Atualiza a Entidade
            manager.merge(t);
            }
            
            manager.getTransaction().commit();
        }catch(Exception e){
            manager.getTransaction().rollback();
        }
    }
    
    public void remover(Class<T>Class, Long id){
        T t = buscarPorId(Class, id);
        
        try{
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        }catch(Exception e){
            manager.getTransaction().rollback();
        }
    }
    
    @SuppressWarnings("unchecked")
    public List<T>buscarTodos(String jpql){
        Query query = manager.createQuery(jpql);
        return query.getResultList();
    }
    
}
