package userm8;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteController {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class, 100);
	if(dbUser!=null) {
//		id is present so i can delete the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(dbUser);
		entityTransaction.commit();
	}else {
//		id is not present
//		if im going to call remove method then it will give you a exception
		System.out.println("Sorry Id is not present to delete the data");
	}
}
}
