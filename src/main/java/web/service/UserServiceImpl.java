package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    public List<User> getAllUsers() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getAllUsers();
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    public void deleteUser(long id){
        userDao.deleteUser(id);
    }

     public User getUser(long id){
        return userDao.getUser(id);
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }
}
