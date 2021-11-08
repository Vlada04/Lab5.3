import User.User;
import delivery.Delivery;
import flowerstore.FlowerPack;
import flowerstore.Item;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class Order {
    List<Item> items = new ArrayList<Item>();
    public Payment payment;
    public Delivery delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public double calculateTotalPrice(){
        double price = 0;
        for (int i = 0; i < items.size(); i++){
            price += items.get(i).getPrice();
        }
        return price;
    }

    public String processOrder(){
        return "Your order is in process";
    }

    public void addItem(Item item){
        items.add(item); }

    public void removeItem(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i) == item) {
                int index = items.indexOf(item);
                items.remove(index);
            }
        }
    }

    public List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUser() {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            user.update(true);
        }
    }

    public void order() {
        notifyUser();
    }
}
