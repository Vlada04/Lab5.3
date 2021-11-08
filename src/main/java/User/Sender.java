package User;

public class Sender implements User{
    @Override
    public boolean update(boolean status){
        if (status == true) {
            System.out.println("Mailing list sent out!");
            return true;
        }
        return false;
    }
}
