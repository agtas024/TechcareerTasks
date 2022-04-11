package com.example.task4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.task4.databinding.FragmentBBinding;

public class BFragment extends Fragment {
    private FragmentBBinding bBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bBinding = FragmentBBinding.inflate(inflater, container, false);
        BFragmentArgs.fromBundle(getArguments());
        bBinding.buttonBdenYye.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(BFragmentDirections.bTOy());
        });
        return bBinding.getRoot();
    }
}