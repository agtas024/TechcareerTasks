package com.example.task4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.task4.databinding.FragmentABinding;

public class AFragment extends Fragment {

    private FragmentABinding aBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        aBinding = FragmentABinding.inflate(inflater, container, false);
        AFragmentArgs.fromBundle(getArguments());
        aBinding.buttonAdanBye.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(AFragmentDirections.actionAFragmentToBFragment());
        });
        return aBinding.getRoot();
    }
}