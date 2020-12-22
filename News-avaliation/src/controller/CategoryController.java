/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import model.Category;

/**
 *
 * @author georgeborsato
 */
public class CategoryController extends GenericController<Category>{
    
    public List<Category> searchCategory(String description){
        EntityManager em = getEntityManager();
        
        try{
            
             TypedQuery<Category> query = em.createQuery("Select c from Category c where c.description LIKE :description", Category.class); 
             query.setParameter("description", "%"+description+"%");
             List<Category> categories  = query.getResultList();
             return categories;
            
        }catch(NoResultException e){
            return null;
        }finally{
            em.close();
        }
    }
}
