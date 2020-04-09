package Docker_Mongo.Controller;

import Docker_Mongo.Entry.User;
import Docker_Mongo.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("findall")
    public ResponseEntity<String> findall(){
        System.out.println("findall.......");
        List<User> all = userService.findAll();
        System.out.println(all);
        return ResponseEntity.ok("ok");
    }

    @GetMapping("insert")
    @ResponseBody
    public ResponseEntity<String> insert(){
        System.out.println("insert.......");
        User user = new User();
        user.setAge(11);
        user.setId("100");
        user.setUsername("shahai");
        user.setPassword("nanshou");


        userService.insert(user);
        List<User> all = userService.findAll();
        System.out.println(all);
        return ResponseEntity.ok("insert");
    }


    @GetMapping("findById")
    public ResponseEntity<User> findById(){
        User id = userService.findById("100");
        System.out.println(id);
        return ResponseEntity.ok(id);
    }
}
