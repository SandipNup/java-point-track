package test.userstore.service;

import test.userstore.entity.Store;
import test.userstore.entity.User;
import test.userstore.shared.dto.UserDto;
import test.userstore.ui.models.request.UserDetailRequestModel;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getUsers();

    UserDto createUser(UserDetailRequestModel user);

    Set<Store> getUserStores(Long userId);
}
