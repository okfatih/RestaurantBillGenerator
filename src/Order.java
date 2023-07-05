public class Order {

    public int orderCode;
    public Dish dish; // Yemek ismi için Dish classmıdan obje oluşturuyorum
    public int numberOfDish;
    public double orderPrice;

    public Order(Dish dish, int numberOfDish) {
        this.dish = dish;
        this.numberOfDish = numberOfDish;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public void setPrice() {
        this.orderPrice = this.dish.getPrice() * this.numberOfDish;
    }

}
