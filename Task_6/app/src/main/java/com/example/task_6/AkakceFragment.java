package com.example.task_6;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task_6.databinding.FragmentAkakceBinding;

import java.util.ArrayList;
import java.util.List;

public class AkakceFragment extends Fragment {
    private FragmentAkakceBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentAkakceBinding.inflate(inflater, container, false);

        tasarim.rv.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));


        List<Market> marketList = new ArrayList<>();
        Market market1 = new Market(1, "Temel Gıda", "temelgida");
        Market market2 = new Market(2, "Atıştırmalık", "atistirma");
        Market market3 = new Market(3, "Çay, Kahve", "cay");
        Market market4 = new Market(4, "Soğuk İçecek", "soguk");
        Market market5 = new Market(5, "Konserve, Sos", "konserve");
        Market market6 = new Market(6, "Süt, Kahvaltılık", "sut");
        Market market7 = new Market(7, "Meyve, Sebze", "sebze");
        Market market8 = new Market(8, "Temizlik", "temizlik");
        Market market9 = new Market(9, "Kağıt Ürünler", "kagit");
        Market market10 = new Market(10, "Mutfak Sarf", "sarf");
        Market market11 = new Market(11, "Bebek, Oyuncak", "bebek");
        Market market12 = new Market(12, "Kozmetik, Bakım", "bakim");
        marketList.add(market1);
        marketList.add(market2);
        marketList.add(market3);
        marketList.add(market4);
        marketList.add(market5);
        marketList.add(market6);
        marketList.add(market7);
        marketList.add(market8);
        marketList.add(market9);
        marketList.add(market10);
        marketList.add(market11);
        marketList.add(market12);

        MarketAdapter marketAdapter = new MarketAdapter(requireContext(),marketList);
        tasarim.rv.setAdapter(marketAdapter);

        return tasarim.getRoot();
    }
}