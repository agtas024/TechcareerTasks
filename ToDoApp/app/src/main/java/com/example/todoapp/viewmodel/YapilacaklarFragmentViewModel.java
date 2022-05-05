package com.example.todoapp.viewmodel;

import android.app.Application;


import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.todoapp.entity.Yapilacaklar;
import com.example.todoapp.repo.YapilacaklarDaoRepository;

import java.util.List;

public class YapilacaklarFragmentViewModel extends AndroidViewModel {
    private YapilacaklarDaoRepository irepo;
    public MutableLiveData<List<Yapilacaklar>> yapilacaklarListesi = new MutableLiveData();

    public YapilacaklarFragmentViewModel(@NonNull Application application) {
        super(application);
        irepo = new YapilacaklarDaoRepository(application);
        yukle();
        yapilacaklarListesi = irepo.yapilacaklariGetir();
    }

    public void ara(String aramaKelimesi){
        irepo.yapilacakAra(aramaKelimesi);
    }

    public void sil(int yapilacak_id){
        irepo.yapilacakSil(yapilacak_id);
    }

    public void yukle(){
        irepo.tumYapilacaklariAl();
    }
}

