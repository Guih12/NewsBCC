
package controller;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract  class GenericController<T> {
    
    private EntityManagerFactory emf;
    private Class classe;

    public GenericController() {
        this.emf =  Persistence.createEntityManagerFactory("Noticies-avaliationPU");
        ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
        this.classe = ((Class) pt.getActualTypeArguments()[0]);
    }
    
    protected EntityManager getEntityManager(){
        return this.emf.createEntityManager();
    }
    
    public void insert(T entity){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }
    
    public void update(T entity){
         EntityManager em = getEntityManager();
         em.getTransaction().begin();
         em.merge(entity);
         em.getTransaction().commit();
         em.close();
    }
    
    public List<T> getAll(){
        EntityManager em = getEntityManager();
        
        try{
            return em.createQuery("select e from " + this.classe.getName()+ " e").getResultList();
        }finally{
            em.close();
        }
    }
    
    public void delete(T entity){
         EntityManager em = getEntityManager();
          em.getTransaction().begin();
          em.remove(em.merge(entity));
          em.getTransaction().commit();
          em.close();
    }
}
