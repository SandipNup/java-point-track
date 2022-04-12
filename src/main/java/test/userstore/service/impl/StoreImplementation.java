package test.userstore.service.impl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.userstore.entity.Store;
import test.userstore.repositories.StoreRepository;
import test.userstore.service.StoreService;
import test.userstore.shared.dto.StoreDto;

import java.util.List;

@Service
public class StoreImplementation implements StoreService{
    @Autowired
    StoreRepository storeRepository;

    @Override
    public StoreDto createStore(StoreDto store) {
        Store newStore = new Store();
        BeanUtils.copyProperties(store, newStore);

        Store savedStore = storeRepository.save(newStore);
        StoreDto storeReturnDto = new StoreDto();
        BeanUtils.copyProperties(savedStore, storeReturnDto);
        return storeReturnDto;
    }

    @Override
    public List<Store> getStores() {
        return storeRepository.findAll();
    }
}
