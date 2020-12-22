
package controller;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import model.News;

public class NewsController extends GenericController<News>{
 
  
    public News getNewsByPk(int id){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<News> query = em.createQuery("Select n from News n where n.id = :id", News.class);
            query.setParameter("id", id);
            News news = query.getSingleResult();
            return news;
            
        }catch(NoResultException ex){
            return null;
        }finally{
            em.close();
        }
    }
}
