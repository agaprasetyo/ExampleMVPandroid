package id.angga.examplemvcandroid.login;

/**
 * Created by Angga.Prasetiyo on 13/08/2015.
 */
public interface OnLoginFinishedListener {

    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
