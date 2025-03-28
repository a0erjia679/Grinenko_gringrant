package ru.dms.gringrant.service.jpa;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dms.gringrant.model.User;
import ru.dms.gringrant.repository.UserRepository;
import ru.dms.gringrant.service.UserService;

import java.util.List;

@Service("userService")
@Repository
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly=true)
    public List<User> findAll() {
        return  Lists.newArrayList(userRepository.findAll());
    }

    @Transactional(readOnly=true)
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
