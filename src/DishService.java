import java.util.ArrayList;
import java.util.List;

//Dish classsı sadece yemek objesi oluşturmak için kullanacağım bir classken DischService classı yemeklerle ilgili işlemleri yapmak için oluştruduğum class
public class DishService {

    // Yemekleri tutacağımız listeyi create edelim
    // Yemeğe ait farklı verilerin olduğu Dish classını listemizin data typeı olarak
    // seçiyorum
    List<Dish> dishList = new ArrayList<>(); // Listemin içersinde Dish tipinde objeler olacak

    // Aşağıdaki methodda yönetici olarak yemeklerimi oluşturuyorum. Oluşturduğum bu
    // yemeklere diğer classlardan değiştirilme yapılamaz
    public void fillDishList() {
        Dish dish1 = new Dish(100, "Adana Kebabi", 220);
        Dish dish2 = new Dish(101, "Urfa Kebabi", 200.0);
        Dish dish3 = new Dish(102, "Cokertme Kebabi", 200.0);
        Dish dish4 = new Dish(200, "Baklava", 100.0);
        Dish dish5 = new Dish(201, "Kadayif", 85);
        Dish dish6 = new Dish(202, "Kunefe", 75.0);
        Dish dish7 = new Dish(300, "Yayik Ayrani", 30);
        Dish dish8 = new Dish(301, "Kola", 15.);
        Dish dish9 = new Dish(302, "Cay", 15.0);
        Dish dish10 = new Dish(303, "Su", 7.5);
        Dish dish11 = new Dish(304, "Bira", 15);
        Dish dish12 = new Dish(304, "Raki", 25.0);

        // Bu yemeklerimizi yukarıdaki listeye atalim
        this.dishList.add(dish1);
        this.dishList.add(dish2);
        this.dishList.add(dish3);
        this.dishList.add(dish4);
        this.dishList.add(dish5);
        this.dishList.add(dish6);
        this.dishList.add(dish7);
        this.dishList.add(dish8);
        this.dishList.add(dish9);
        this.dishList.add(dish10);
        this.dishList.add(dish11);
        this.dishList.add(dish12);

    }

    public void showDishMenu() {

        System.out.println("             LEZZETLERIMIZ              ");
        System.out.printf("%-3s   %-20s   %-5s \n", "Kod", "Adi", "Fiyat");

        System.out.printf("%-3s   %-20s   %-5s \n", "---", "---", "-----");

        for (Dish dish : this.dishList) {

            System.out.printf("%-3s   %-20s   %-5s Lira\n", dish.getCode(), dish.getName(), dish.getPrice());

        }

    }

    public Dish findDishByCode(int code) {
        if (code == 0) {
            System.out.println("You are being directed to main menu");

        } else {
            for (Dish dish : this.dishList) {
                if (dish.getCode() == code) {
                    return dish;
                }
            }
            System.out.println("Urun bulunamadi");
        }

        return new Dish(0, "", 0);

    }
}