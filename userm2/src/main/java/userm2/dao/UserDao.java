package userm2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import userm2.dto.User;

public class UserDao {

	public void saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}

	public void findUser(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User user = entityManager.find(User.class, id);
		System.out.println(user);

	}

	public void deleteUser(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User user = entityManager.find(User.class, id);
		if (user != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry id is not present");
		}

	}

	public void updateUser(int id, User user) {

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		entityManager.merge(user);
//		entityTransaction.commit();

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User dbUser = entityManager.find(User.class, id);
		if (dbUser != null) {
			//id is present then update it 
			entityTransaction.begin();
			user.setId(id);
			entityManager.merge(user);
			entityTransaction.commit();
		} else {
			// id is not present
			System.out.println("Sorry Id is not present");
		}

	}

}
