import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Siparişlerle ilgili işlemlerimizi yapmak için açtık
public class OrderService {
    Scanner inp = new Scanner(System.in);

    List<Order> orderList = new ArrayList<>();

    public void createOrder(DishService dishService) {

        int dishCode = -1;

        while (dishCode != 0) {
            System.out.println("Lutfen urun kodunu giriniz: ((For Exit: 0)) ");

            dishCode = inp.nextInt(); // Girilen code ile kastedilen ürünü bulmamız lazım
            Dish dish = dishService.findDishByCode(dishCode);
            if (dish.getCode() > 0) {
                System.out.println("Adet giriniz: ");
                int num = inp.nextInt();// 2 tane adana kebabı
                Order order = new Order(dish, num);
                order.setPrice();
                order.setOrderCode(1000 + this.orderList.size());
                this.orderList.add(order);
            }

            // Müşteri verilen siparişleri görüntülesin
            for (Order order : this.orderList) {
                System.out.printf("Siparis kodu:%-5s   Lezzet kodu:%-4s   Name:%-20s   adet%-3s\n", order.orderCode,
                        order.dish.getCode(), order.dish.getName(), order.numberOfDish);
            }

        }

    }

    public void deleteOrder() {
        boolean isValid = true;
        if (orderList.isEmpty()) {
            System.out.println("Siparisiniz bulunmamaktadir!");
        } else {
            System.out.println("Iptal etmek istediginiz siparisin kodunu giriniz.");
            int code = inp.nextInt();
            for (Order order : this.orderList) {
                if (order.orderCode == code) {
                    this.orderList.remove(order);
                    System.out.println("Siparisiniz iptal edildi " + order.dish.toString());
                    isValid = true;
                    break;
                } else {
                    isValid = false;

                }
            }
            if (!isValid) {
                System.out.println("Siparis kodu gecersiz!");
            }

        }

    }

    public void printBill() {
        double totalPrice = 0.0;
        System.out.println("   Lezzet Fisiniz       ");
        for (Order order : this.orderList) {
            System.out.printf("Lezzet kodu:%-5s  Adi:%-20s  Adet:%-5s  Siparis Tutari:%-5s Lira\n",
                    order.dish.getCode(), order.dish.getName(), order.numberOfDish, order.orderPrice);
            totalPrice += order.orderPrice;

        }
        System.out.println("Toplam tutar: " + totalPrice);
        System.out.println("Afiyet olsun iyi gunler");
        this.orderList = new ArrayList<>();
    }

}
