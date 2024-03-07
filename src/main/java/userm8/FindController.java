package userm8;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindController {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class, 1);
    if(dbUser!=null) {
//    	id is present means user data is present
    	System.out.println(dbUser);
    }else {
//    	id is not present and user doesnot exist
    	System.out.println("Sorry Id is not present");
    }
}
}
