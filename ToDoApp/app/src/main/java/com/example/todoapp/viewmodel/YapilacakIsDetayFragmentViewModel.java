package com.example.todoapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.todoapp.repo.YapilacaklarDaoRepository;

public class YapilacakIsDetayFragmentViewModel extends AndroidViewModel {
    private YapilacaklarDaoRepository irepo;

    public YapilacakIsDetayFragmentViewModel(@NonNull Application application) {
        super(application);
        irepo = new YapilacaklarDaoRepository(application);
    }

    public void guncelle(int yapilacak_id, String yapilacak_is){
        irepo.yapilacakGuncelle(yapilacak_id,yapilacak_is);
    }
}
