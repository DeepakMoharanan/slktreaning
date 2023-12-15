package org.example.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {

        List<Product> prodList = new ArrayList();
        prodList.add(new Product(1001, "TV", 95000, 1, "Apple", 0));
        prodList.add(new Product(1002, "Tripod", 7000, 2, "Digitech", 100));
        prodList.add(new Product(1003, "CCTV Camera", 4500, 5, "Mi", 150));
        prodList.add(new Product(1004, "Mobile", 50000, 1, "Samsung", 0));
        prodList.add(new Product(1005, "Monitor", 16000, 4, "Dell", 100));
        prodList.add(new Product(1006, "Mouse", 1200, 15, "logitech", 0));
        prodList.add(new Product(1007, "Camera", 16000, 4, "Dell", 100));
        prodList.add(new Product(1008, "Mouse", 1200, 15, "logitech", 0));
        prodList.add(new Product(1009, "Camera", 16000, 4, "Dell", 100));
        //Find out names of all the product with zero delivery charges

        List<String> data= prodList.stream()
                .filter(p->p.deliveryCharges==0)
                .map(p->p.name)
                .collect(Collectors.toList());
        System.out.println(data);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        List<String> data1= prodList.stream()
                .filter(p->p.deliveryCharges==0)
                .filter((p->p.brand.equals("logitech")))
                .map(p->p.name)
                .collect(Collectors.toList());
        System.out.println(data1);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!~SET~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Set<String> data2 = prodList.stream()
                .filter(p->p.deliveryCharges==0)
                .map(p->p.name)
                .collect(Collectors.toSet());
        System.out.println(data2);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@~MAP~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Map<Integer,String> data3 = prodList.stream()
                .collect(Collectors.toMap(p->p.prodId,p->p.name));
        System.out.println(data3);
    }

}
