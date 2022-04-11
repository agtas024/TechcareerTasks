package com.example.task4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.task4.databinding.FragmentYBinding;

public class YFragment extends Fragment {
    private FragmentYBinding yBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        yBinding = FragmentYBinding.inflate(inflater,container,false);
        YFragmentArgs.fromBundle(getArguments());
        yBinding.buttonGeriGit.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(YFragmentDirections.yTOana());
        });
        return yBinding.getRoot();
    }

}