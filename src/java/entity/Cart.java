package entity;

public class Cart {

	private Services service;
	private int quantity;

	public Cart() {
	}

    public Cart(Services service, int quantity) {
        this.service = service;
        this.quantity = quantity;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

	

}
