import java.util.Scanner;

public class BillGenerator {

    public static void main(String[] args) {

        start();
    }

    public static void start() {
        OrderService orderService = new OrderService();
        DishService dishService = new DishService();
        dishService.fillDishList();
        getSelectionMenu(dishService, orderService);

    }

    public static void getSelectionMenu(DishService dishService, OrderService orderService) {
        Scanner inp = new Scanner(System.in);

        int select = -1;

        while (select != 0) {

            System.out.println("------------------------------------------------");
            System.out.println(" *** Lezzet Restaurant Siparis *** ");
            System.out.println("1- Menu");
            System.out.println("2-  Siparis Girme");
            System.out.println("3- Siparis Iptal Etme");
            System.out.println("4- Hesap olusturma");
            System.out.println("0- Exit");
            System.out.println("Seciminiz: ");
            select = inp.nextInt();
            System.out.println("------------------------------------------------");

            switch (select) {
                case 1:
                    dishService.showDishMenu();
                    break;
                case 2:
                    orderService.createOrder(dishService);
                    break;
                case 3:
                    orderService.deleteOrder();
                    break;
                case 4:
                    orderService.printBill();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali giris");

            }
        }
        System.out.println("Have a nice day!!!");
    }

}

// Restoranın online sipariş alan sisteminden hesabı yazdıran uygulama yapacapız
// Yiyecekler bir listede tutulacak ve bu yiyeceklerin kodu, ismi ve ücreti
// olacak
// Yiyecek menüsü-- Sipraiş oluşturmak/iptal etmek ve hesap oluşturmak için
// semim menüsü gösterilecek
// Yiyecek menümüzde: Listedeki yiyecekler menü şeklinde listelenecek
// Sipariş girerken, yiyeceğin kodu ve istenilen adet girilerek sipariş
// oluşturulacak
// Her sipraiş için kod üretilecek ve herbir yiyecek siparişi içinm tutar
// hesaplanacak
// Sipariş iptal: Sipariş kodu girilere sipariş silinecek
// Hesap oluşturmak için tutarları ile birlikte tüm sipaişleri ve toplam tutarı
// gösteren bir hesap fişi yazdırılacak