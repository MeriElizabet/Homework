package hw14B;

public class BookStore {
    public static void main(String[] args) {
        //BookStore
        Characteristics book998 = new Characteristics();
        book998.barcode = 87543001;
        book998.name = "ZolotayaRybka";
        book998.author = "Pushkin";
        book998.publisher = "Yula";
        book998.price = 400;
        book998.coupon = 50;

        Characteristics book876 = new Characteristics();
        book876.barcode = 157890005;
        book876.name = "Mumu";
        book876.author = "Turgeniev";
        book876.publisher = "ZolotoyList";
        book876.price = 360;
        book876.coupon = 50;

        Characteristics book11 = new Characteristics();
        book11.barcode = 666865;
        book11.name = "Jamilya";
        book11.author = "Aitmatov";
        book11.publisher = "Nooryz";
        book11.price = 999;
        book11.coupon = 0;

        Characteristics book2341 = new Characteristics();
        book2341.barcode = 150080005;
        book2341.name = "KyrgyzTil";
        book2341.author = "Saparov";
        book2341.publisher = "Nooryz";
        book2341.price = 550;
        book2341.coupon = 50;

        System.out.println("Книга № 998:");
        System.out.println("Штрих код: " + book998.barcode + ", Название книги: " + book998.name + ", Автор: " + book998.author + ", Издатель: " + book998.publisher + ", Цена: " + book998.price + ", Купон: " + book998.coupon + ";" );
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.println("Книга № 876:");
        System.out.println("Штрих код: " + book876.barcode + ", Название книги: " + book876.name + ", Автор: " + book876.author + ", Издатель: " + book876.publisher + ", Цена: " + book876.price + ", Купон: " + book876.coupon + ";" );
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.println("Книга № 11:");
        System.out.println("Штрих код: " + book11.barcode + ", Название книги: " + book11.name + ", Автор: " + book11.author + ", Издатель: " + book11.publisher + ", Цена: " + book11.price + ", Купон: " + book11.coupon + ";" );
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.println("Книга № 2341:");
        System.out.println("Штрих код: " + book2341.barcode + ", Название книги: " + book2341.name + ", Автор: " + book2341.author + ", Издатель: " + book2341.publisher + ", Цена: " + book2341.price + ", Купон: " + book2341.coupon + ";" );
        System.out.println("------------------------------------------------------------------------------------------------------------------");

    }
}
