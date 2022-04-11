package com.example.task4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.task4.databinding.FragmentXBinding;

public class XFragment extends Fragment {
    private FragmentXBinding xBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        xBinding = FragmentXBinding.inflate(inflater,container,false);
        XFragmentArgs.fromBundle(getArguments());
        xBinding.buttonXdenYye.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(XFragmentDirections.xTOy());
        });
        return xBinding.getRoot();
    }
}