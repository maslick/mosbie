package com.maslick.mosbie;

import android.content.Context;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

/**
 * Created by maslick on 20.12.2016.
 */

public class MainPresenterImpl extends MvpBasePresenter<MainView> implements MainPresenter {

    private final ClickCounterModel model;

    public MainPresenterImpl(Context context) {
        model = new ClickCounterModel(context);
    }

    @Override
    public void buttonPressed() {
        model.increaseCounter();
        if (isViewAttached()) {
            getView().showCounter(model.getCount());
        }
    }
}
