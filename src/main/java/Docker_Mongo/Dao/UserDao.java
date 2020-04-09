package Docker_Mongo.Dao;

import Docker_Mongo.Entry.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserDao extends MongoRepository<User, String> {
}
