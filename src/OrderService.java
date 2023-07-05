import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Siparişlerle ilgili işlemlerimizi yapmak için açtık
public class OrderService {

    List<Order> orderList = new ArrayList<>();

    public void createOrder(DishService dishService) {

        int dishCode = -1;

        while (dishCode != 0) {
            System.out.println("Lutfen urun kodunu giriniz: ((For Exit: 0)) ");
            Scanner inp = new Scanner(System.in);
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

}
