package test.userstore.ui.models.request;


public class StoreDetailRequestModel {
	   
		private String storeName;

	    private String storeDescription;

	    private Long storeNumber;

	    private String storeAddress;
	    
	    private int roleId;
	    
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
			return roleId;
		}

		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}
}