package com.example.todoapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.todoapp.repo.YapilacaklarDaoRepository;

public class YapilacakIsKayitFragmentViewModel extends AndroidViewModel {
    private YapilacaklarDaoRepository irepo;

    public YapilacakIsKayitFragmentViewModel(@NonNull Application application) {
        super(application);
        irepo = new YapilacaklarDaoRepository(application);
    }

    public void kayit(String yapilacak_is){
        irepo.yapilacakKayit(yapilacak_is);
    }
}
