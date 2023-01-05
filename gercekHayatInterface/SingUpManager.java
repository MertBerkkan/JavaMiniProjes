package gercekHayatInterface;

public class SingUpManager {

    private IUserCheckService iUserCheckService;

    public SingUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void signUp(User user) {

        if (iUserCheckService.checkUser(user)) {
            System.out.println("Kullanıcı kayıt oldu.=> " + user.getName());
        } else {
            System.out.println("Kullanıcı kayıt olamadı.(Kurallara uygun değil.) => " + user.getName());
        }
    }
}
