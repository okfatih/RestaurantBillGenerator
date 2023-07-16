public class Dish {

    // Bu classın amacı sadece yemek objesi oluşturmak
    private int code;

    private String name;

    private double price;

    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    // Bu değerler oluştruluker bir kez giriliyor ve setters olmadığından birdaha
    // müdahale edilemiyor. Dolayısıyla tam bir encapsulation yapılmış olunuyor

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[Code=" + code + ", Name=" + name + ", Price=" + price + "]";
    }

}

// Instance variable larımız private yaptık ve getter methodlarımızı koyduk
// Sadece restorantın sahibi bu değerler üzerinde yetkisi olabilsin diye yazdık
// aynı zamanda Dish objesini tüm fieldleriyle beraber yazdırabilmek için
// toString methodu kullandık. BU CLASSIMIZ YEMEK OBJESİNİ OLUŞTURABİLECEĞİMİZ
// BİR KALIP. YEMEKLERLE İLGİLİ İŞLEMLER YAPACAĞIM YENİ CLASSLAR DA OLUŞTURMAM
// GEREKECEK. MESELA YEMEKLERİ LİSTEYE ATIP NUMARALANDIRMA GİBİ İŞLEMLER YAPMAM
// LAZIM