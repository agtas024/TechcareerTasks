package com.example.task4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.task4.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding anasayfaBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        anasayfaBinding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        AnasayfaFragmentArgs.fromBundle(getArguments());
        anasayfaBinding.buttonANAdanAya.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(AnasayfaFragmentDirections.actionAnasayfaFragmentToAFragment());
        });
        anasayfaBinding.buttonANAdanXe.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(AnasayfaFragmentDirections.anaTOx());
        });

        return anasayfaBinding.getRoot();
    }
}