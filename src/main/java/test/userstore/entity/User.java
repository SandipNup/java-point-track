package test.userstore.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

//import test.sunilstest.entity.StoreEntity;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 512234458983l;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 50)
    private String userName;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false, length = 50)
    private String salt;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 120, unique = true)
    private String emailAddress;

    @Column(nullable = false, length = 120, unique = true)
    private String mailingAddress;

    @ManyToMany
//    @JoinTable(
//    		name = "store_entity",
//    		joinColumns = @JoinColumn(name = "user_id"),
//    		inverseJoinColumns = @JoinColumn(name = "store_id"))
    @JoinTable(
    		name = "user_store",
    		joinColumns = {@JoinColumn(name = "user_id")},
    	    inverseJoinColumns = {@JoinColumn(name = "store_id")})
    private Set<Store> stores = new HashSet<>();

    @Column(nullable = false)
    private Long userRole;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public Long getUserRole() {
        return userRole;
    }

    public void setUserRole(Long userRole) {
        this.userRole = userRole;
    }

    public Set<Store> getStores() {
        return stores;
    }

    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }

    public void addStore(Store store){
        this.stores.add(store);
    }
}
