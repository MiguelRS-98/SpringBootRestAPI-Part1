package co.escuelaing.ieti.service;

import co.escuelaing.ieti.data.User;

import java.util.List;

public interface UserService
{
    User create(User user);
    User findById(String id);
    List<User> all();
    void deleteById(String id);
    User update(User user, String userId);
}