package com.devband.tronwalletforandroid.ui.createaccount;

import com.devband.tronwalletforandroid.ui.mvp.IView;

public interface CreateAccountView extends IView {

    void createdAccount();

    void passwordError();

    void registerWalletError();
}
