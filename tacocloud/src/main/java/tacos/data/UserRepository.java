package tacos.data;

import org.springframework.data.repository.CrudRepository;

import tacos.MyUser;

public interface UserRepository extends CrudRepository<MyUser, Long> {
    
    MyUser findByUsername(String username);

}
