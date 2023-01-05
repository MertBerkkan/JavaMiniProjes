package gercekHayatInterface;

public class Test {

    public static void main(String[] args) {
        SingUpManager singUpManager = new SingUpManager(new AgeUserCheckService());
        singUpManager.signUp(new User(2456, "Mert ÜRER", 25));

        SingUpManager singUpManager1 = new SingUpManager(new CompleteUserCheckService());
        singUpManager1.signUp(new User(1254, "Mehmet Ali", 17));
    }
}
