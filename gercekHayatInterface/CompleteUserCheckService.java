package gercekHayatInterface;

public class CompleteUserCheckService implements IUserCheckService {

    @Override
    public boolean checkUser(User user) {

        if (user.getAge() >= 18 && user.getName().startsWith("Me")){
            return true;
        }
        return false;
    }
}
