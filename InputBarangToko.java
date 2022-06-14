import java.util.Scanner;

public class InputBarangToko {

  public static void main(String[] args) {
    String newLine = System.getProperty("line.separator");
    Helpers helpers = new Helpers();
  
    Scanner setUsername = new Scanner(System.in);
    helpers.inputAndOutput("Masukkan Nama Anda:");
    
    String username = setUsername.nextLine();
    helpers.headerAndFoot(" Input ", username, "header");
    
    String setItemNameForm = "Masukkan Nama Barang Yang Mau Ditambah:";
    helpers.inputAndOutput(setItemNameForm);
    Scanner setItemName = new Scanner(System.in);
    
    String itemName = setItemName.nextLine();

    Scanner setItemQuantity = new Scanner(System.in);
    String setItemQuantityForm = "Masukkan Jumlah Barang Yang Mau Ditambah";
    helpers.inputAndOutput(setItemQuantityForm);
    
    Integer itemTotal = setItemQuantity.nextInt();
    
    Scanner setItemPricePurchase = new Scanner(System.in);
    String setItemPricePurchaseForm = "Masukkan Harga Beli Untuk Barang Tersebut:";
    helpers.inputAndOutput(setItemPricePurchaseForm);
  
    Float itemPricePurchase = setItemPricePurchase.nextFloat();
    
    Scanner setItemPriceSale = new Scanner(System.in);
    String setItemPriceSaleForm = "Masukkan Harga Jual Untuk Barang Tersebut:";
    helpers.inputAndOutput(setItemPriceSaleForm);
    
    Float itemPriceSale = setItemPriceSale.nextFloat();

    helpers.headerAndFoot(" Rincian ", "", "footer");

    helpers.inputAndOutput("Nama Barang    : " + itemName);
    helpers.inputAndOutput("Jumlah Barang  : " + itemTotal);
    helpers.inputAndOutput("Harga Jual     : Rp. " + itemPriceSale);
    helpers.inputAndOutput("Harga Beli     : Rp. " + itemPricePurchase);

   }
}