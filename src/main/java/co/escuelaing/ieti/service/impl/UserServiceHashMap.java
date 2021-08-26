package co.escuelaing.ieti.service.impl;

import co.escuelaing.ieti.service.UserService;
import org.springframework.stereotype.Service;

import co.escuelaing.ieti.data.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class UserServiceHashMap implements UserService
{
    private final HashMap<String, User> userHM = new HashMap<>();

    @Override
    public User create (User user)
    {
        userHM.put(user.getIdUser(), user);
        return user;
    }

    @Override
    public User findById (String id)
    {
        return userHM.get(id);
    }

    @Override
    public List<User> all ()
    {
        return new ArrayList<>(userHM.values());
    }

    @Override
    public void deleteById (String id)
    {
        userHM.remove(id);
    }

    @Override
    public User update (User user, String userId)
    {
        user.setIdUser(userId);
        userHM.put(userId, user);
        return user;
    }
}