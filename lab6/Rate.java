package lab6;

import java.util.Objects;

public class Rate {
    private String name;
    private int amountOfClients;
    private int price;

    public Rate(int v, int p){
        amountOfClients = v;
        price = p;
    }

    public int getPrice(){
        return price;
    }

    public String getName() {return getClass().getSimpleName();}

    @Override
    public String toString() {
        return "Rate{" +
                "class=" + /*this.*/getClass().getSimpleName() +
                ", price=" + price +
                '}';
    }

    public int getAmountOfClients() {
        return amountOfClients;
    }

    public String getInformation(){ return "Name: " +getClass().getSimpleName()+"; Clients: " +amountOfClients+"; Price: "+price;  }

    public int hashCode(){
        return Objects.hash(price);
    }


}
