package test.userstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 50)
    private String customerName;

    @Column(nullable = true)
    private String customerAddress;

    @Column(nullable = false)
    private Long phoneNumber;

    @Column(nullable = false)
    private LocalDateTime joinedDate;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CustomerTransaction> transactionList;

    @Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", phoneNumber=" + phoneNumber + ", joinedDate=" + joinedDate + ", transactionList=" + transactionList
				+ ", rewardPoint=" + rewardPoint + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(LocalDateTime joinedDate) {
		this.joinedDate = joinedDate;
	}

	public Set<CustomerTransaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(Set<CustomerTransaction> transactionList) {
		this.transactionList = transactionList;
	}

	public String getRewardPoint() {
		return rewardPoint;
	}

	public void setRewardPoint(String rewardPoint) {
		this.rewardPoint = rewardPoint;
	}

	private String rewardPoint;
    
}
