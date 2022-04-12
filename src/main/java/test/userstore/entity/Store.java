package test.userstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Store {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 50)
    private String storeName;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String storeDescription;

    @Column(nullable = false)
    private Long storeNumber;

    @Column(nullable = false)
    private String storeAddress;
    
    @Column(nullable = false)
    private int roleId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public Long getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(Long storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }
    
    public int getRoleId() {
    	return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
    	this.roleId = roleId;
    }
}
