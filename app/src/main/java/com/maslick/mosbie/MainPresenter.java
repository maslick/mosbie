package com.maslick.mosbie;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by maslick on 20.12.2016.
 */

public interface MainPresenter extends MvpPresenter<MainView> {
    void buttonPressed();
}
