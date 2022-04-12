package test.userstore.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.userstore.entity.Store;
import test.userstore.service.StoreService;
import test.userstore.shared.dto.StoreDto;
import test.userstore.ui.models.request.StoreDetailRequestModel;
import test.userstore.ui.models.response.StoreResponse;

import java.util.List;

@RestController
@RequestMapping("stores")
public class StoreController {
    @Autowired
    StoreService storeService;

    @GetMapping
    public List<Store> getStores(){
        return storeService.getStores();
        
    }
    @PostMapping
    public StoreResponse createStore(@RequestBody StoreDetailRequestModel storeDetail) {
        StoreResponse response = new StoreResponse();
        StoreDto storeDto = new StoreDto();
        BeanUtils.copyProperties(storeDetail, storeDto);
        StoreDto createdStore = storeService.createStore(storeDto);
        BeanUtils.copyProperties(createdStore, response);
        return response;
    }
}
