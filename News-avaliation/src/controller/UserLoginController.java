
package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.User;

public class UserLoginController {
    
     EntityManagerFactory emf;

    public UserLoginController() {
        this.emf = Persistence.createEntityManagerFactory("Noticies-avaliationPU");
    }
     
     
    public User autenticateUser(String login, String password){
          EntityManager em  = this.emf.createEntityManager();
          
          try{
              TypedQuery<User> query = em.createQuery("select u from User u where u.login = :login "
                  + "and u.password = :password", User.class);
              query.setParameter("login", login);
              query.setParameter("password", password);
             
              return query.getSingleResult();
              
          }catch(NoResultException ex){
              return null;
          }
          finally{
              em.close();
          }
    }
}
