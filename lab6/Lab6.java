package lab6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab6 {
    public static void main(String[] args) {
        Econom econom = new Econom();
        Vip vip = new Vip();
        Standart standart = new Standart();

        int totalprice = econom.getAmountOfClients() + vip.getAmountOfClients()+ standart.getAmountOfClients();
        System.out.println("Avaible rates: "+econom.getName()+", "+vip.getName()+", "+standart.getName());
        System.out.println("Total amount of clients: "+totalprice);
        System.out.println("----------------------------------------------");
        System.out.println("Sorted equipment");
        ArrayList<Rate> am = new ArrayList<>();
        am.add(econom);
        am.add(vip);
        am.add(standart);

        for(int i = am.size()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(am.get(j).getPrice() > am.get(j+1).getPrice()){
                    Rate tmp = am.get(j);
                    am.set(j, am.get(j + 1));
                    am.set(j + 1, tmp);
                }
            }
        }
        for (int i = 0; i < am.size(); i++) {
            System.out.println(am.get(i).getInformation());
        }
        System.out.println("----------------------------------------------");
        System.out.println("Enter the range of prices:");
        System.out.print("from:");
        Scanner scanner = new Scanner(System.in);
        int numberFrom = scanner.nextInt();
        System.out.print("to:");
        int numberTo = scanner.nextInt();

        for (int i = 0; i < am.size(); i++) {
            if ((am.get(i).getPrice() >= numberFrom)
                    && (am.get(i).getPrice() <= numberTo)) {
                System.out.println(am.get(i).getInformation());
            }
        }


    }
}