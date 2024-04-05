package com.mycompany.cajaregistradora;

import java.util.Scanner;

public class Articulos {

    Scanner stnd = new Scanner(System.in);

    public void datos() {
        String pro1, pro2, pro3, pro4, pro5, pro6, pro7, pro8;
        int ca1, ca2, ca3, ca4, ca5, ca6, ca7, ca8;
        float precio;
        System.out.println("ingresa el nombre del primer producto");
        pro1 = stnd.nextLine();
        System.out.println("ingresa el nombre del segundo producto");
        pro2 = stnd.nextLine();
        System.out.println("ingresa el nombre del tercer producto");
        pro3 = stnd.nextLine();
        System.out.println("ingresa el nombre del cuarto  producto");
        pro4 = stnd.nextLine();
        System.out.println("ingresa el nombre del quinto producto");
        pro5 = stnd.nextLine();
        System.out.println("ingresa el nombre del sexto producto");
        pro6 = stnd.nextLine();
        System.out.println("ingresa el nombre del septimo producto");
        pro7 = stnd.nextLine();
        System.out.println("ingresa el nombre del octavo producto");
        pro8 = stnd.nextLine();

        //------------------------------------------------------------------------------------------------------------------------------------     
        System.out.println("Ingresa al cantidad del producto "+pro1);
        ca1 = stnd.nextInt();
        System.out.println("Ingresa al cantidad del segundo producto");
        ca2 = stnd.nextInt();
        System.out.println("Ingresa al cantidad del tercer vproducto");
        ca3 = stnd.nextInt();
        System.out.println("Ingresa al cantidad del cuarto producto");
        ca4 = stnd.nextInt();
        System.out.println("Ingresa al cantidad del quinto producto");
        ca5 = stnd.nextInt();
        System.out.println("Ingresa al cantidad del sexto producto");
        ca6 = stnd.nextInt();
        System.out.println("Ingresa al cantidad del septimo producto");
        ca7 = stnd.nextInt();
        System.out.println("Ingresa al cantidad del octavo producto");
        ca8 = stnd.nextInt();

        //---------------------------------------------------------------------------------------------------------------------------------
        System.out.println("inegresa el precio de los productos");
        precio = stnd.nextFloat();

        //----------------------------------------------------------------------------------------------------------------------------  
        productos prow = new productos();
        prow.Cantidad(ca1, ca2, ca3, ca4, ca5, ca6, ca7, ca8);
        prow.product(pro1, pro2, pro3, pro4, pro5, pro6, pro7, pro8);
        prow.Precio(precio);
        prow.Operaciones();
        prow.ticket();
    }

}
