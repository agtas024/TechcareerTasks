package com.example.todoapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class YapilacakIsDetayVMF extends ViewModelProvider.NewInstanceFactory  {
    private final Application application;

    public YapilacakIsDetayVMF(Application application) {
        this.application = application;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new YapilacakIsDetayFragmentViewModel(application);
    }
}
