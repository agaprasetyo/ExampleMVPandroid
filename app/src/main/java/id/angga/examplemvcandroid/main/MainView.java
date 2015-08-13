package id.angga.examplemvcandroid.main;

import java.util.List;

/**
 * Created by Angga.Prasetiyo on 13/08/2015.
 */
public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
