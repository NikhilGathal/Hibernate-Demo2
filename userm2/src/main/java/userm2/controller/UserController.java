package userm2.controller;

import userm2.dao.UserDao;
import userm2.dto.User;

public class UserController {

	public static void main(String[] args) {

		// insert (Save) user

		User user = new User();
		user.setName("Aniket");
		user.setAddress("Parbhani");

		UserDao userDao = new UserDao();
		userDao.saveUser(user);

		// select (Find)user

//		UserDao userDao = new UserDao();
//		userDao.findUser(1);

		// Delete User

//		UserDao userDao = new UserDao();
//		userDao.deleteUser(100);

		// Update User

		// without if else using direct merge()

//		User user = new User();
//		user.setId(1);
//		user.setName("Aniket");
//		user.setAddress("Nagar");
//		UserDao userDao = new UserDao();
//		userDao.updateUser(user);

		// with using if and else to update

//		User user = new User();
//		user.setId(10);
//		user.setName("Aniket");
//		user.setAddress("Nagar");
//		UserDao userDao = new UserDao();
//		userDao.updateUser(10,user);

//		User user = new User();
//		user.setName("Mangesh");
//		user.setAddress("Parli");
//		UserDao userDao = new UserDao();
//		userDao.updateUser(10, user);
		
		

	}

}
