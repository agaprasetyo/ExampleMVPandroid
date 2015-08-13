package id.angga.examplemvcandroid.login;

/**
 * Created by Angga.Prasetiyo on 13/08/2015.
 */
public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
