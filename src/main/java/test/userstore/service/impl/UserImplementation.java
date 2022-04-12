package test.userstore.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.userstore.entity.Store;
import test.userstore.entity.User;
import test.userstore.exceptions.ResourceNotFoundExceptions;
import test.userstore.repositories.StoreRepository;
import test.userstore.repositories.UserRepository;
import test.userstore.service.UserService;
import test.userstore.shared.dto.UserDto;
import test.userstore.ui.models.request.UserDetailRequestModel;

import java.util.List;
import java.util.Set;

@Service
public class UserImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    StoreRepository storeRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDto createUser(UserDetailRequestModel user) {

        List<Long> storesIds = user.getStores();
        User newUser = new User();

        BeanUtils.copyProperties(user, newUser);
        for(long storeId: storesIds){
            Store store = storeRepository.findById(storeId).orElseThrow(
                    ()-> new ResourceNotFoundExceptions(String.format("Store with Id %d does not exists", storeId)));
            newUser.addStore(store);
        }

        User savedUser = userRepository.save(newUser);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(savedUser, userDto);

        return userDto;
    }

    @Override
    public Set<Store> getUserStores(Long userId){
        User user = userRepository.findById(userId).orElseThrow(
                ()-> new ResourceNotFoundExceptions(String.format("User does not exist for id %d", userId))
        );
        return user.getStores();
    }
}
