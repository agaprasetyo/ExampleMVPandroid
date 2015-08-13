package id.angga.examplemvcandroid.main;

import java.util.List;

/**
 * Created by Angga.Prasetiyo on 13/08/2015.
 */
public class MainPresenterImpl implements MainPresenter, OnFinishedListener {

    private MainView mainView;
    private FindItemsInteractor findItemsInteractor;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        findItemsInteractor = new FindItemsInteractorImpl();
    }

    @Override
    public void onResume() {
        mainView.showProgress();
        findItemsInteractor.findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        mainView.showMessage(String.format("Position %d clicked", position + 1));
    }

    @Override
    public void onFinish(List<String> items) {
        mainView.setItems(items);
        mainView.hideProgress();
    }
}
