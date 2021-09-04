package automation;

public class Login {

    private void setLogin(String userName) {
        System.out.println(userName);
    }

    private void setPassword(String password) {
        System.out.println(password);
    }

    private void clickOnLogin() {
        System.out.println("login");
    }

    public void loginFunctionality(String uName, String pass) {
        setLogin(uName); //aaa
        setPassword(pass); //bbb
        clickOnLogin();
    }
}
