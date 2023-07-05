import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Siparişlerle ilgili işlemlerimizi yapmak için açtık
public class OrderService {

    List<Order> orderList = new ArrayList<>();

    public void createOrder() {

        int dishCode = -1;

        while (dishCode != 0) {
            System.out.println("Lutfen urun kodunu giriniz: ((For Exit: )) ");
            Scanner inp = new Scanner(System.in);
            dishCode = inp.nextInt(); // Girilen code ile kastedilen ürünü bulmamız lazım

        }

    }

}
