package userm8;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateController {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter id to be update");
	int id =scanner.nextInt();
	
	User user=new User();
	System.out.println("Name");
	String name=scanner.next();
	System.out.println("address");
	String address=scanner.next();
	
	user.setAddress(address);
	user.setName(name);
	
	UpdateController controller=new UpdateController();
	controller.UpdateUser(id, user);

}


public void UpdateUser(int id,User user) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class, id);
	
	if(dbUser!=null) {
//		id is present 
//		if im going to call merge method then it will update the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		user.setId(id);
//		user=id,name,address
		entityManager.merge(user);
		entityTransaction.commit();
	}else {
//		id is not present
//		if im going to call merge method then it will insert the data
//		so im not going to call merge method only
		System.out.println("Sorry Id is not present to update the data");
	}
	
	
}








}
