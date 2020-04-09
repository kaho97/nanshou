package Docker_Mongo.Service;

import Docker_Mongo.Dao.UserDao;
import Docker_Mongo.Entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }

    public void insert(User user){
        userDao.insert(user);
    }

    public void saveComment(User user){
        userDao.save(user);
    }

    public User findById(String id){
        return userDao.findById(id).get();
    }
}
