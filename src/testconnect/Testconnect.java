/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconnect;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Testconnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        connect conDB = new connect();
        List<sanpham> products = conDB.products();
        header();
        products.forEach(p -> System.out.println(p));
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.print("Nhập thông tin loại sản phẩm cần thêm: ");
        String productTypeName = sc.nextLine();
        conDB.insertProductType(productTypeName);
        List<sanpham> listProductType = conDB.listProductType();
        System.out.printf("Mã loại SP","Tên Loại SP");
        listProductType.forEach(e-> System.out.println(e));
    }
    public static void header(){
        System.out.printf("Mã SP","Tên SP","NSX","Loại SP");
    }
}
