package test.userstore.service;

import test.userstore.entity.Store;
import test.userstore.shared.dto.StoreDto;

import java.util.List;

public interface StoreService {
    StoreDto createStore(StoreDto store);

    List<Store> getStores();
}
