package User;

public class Receiver implements User{

    @Override
    public boolean update(boolean status){
        if (status == true) {
            System.out.println("Your order is processing!");
            return true;
        }
        return false;
    }
}
