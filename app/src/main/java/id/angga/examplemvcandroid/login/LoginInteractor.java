package id.angga.examplemvcandroid.login;

/**
 * Created by Angga.Prasetiyo on 13/08/2015.
 */
public interface LoginInteractor {
    void login(String username, String password, OnLoginFinishedListener listener);
}
