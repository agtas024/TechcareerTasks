package com.example.todoapp.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todoapp.R;
import com.example.todoapp.databinding.FragmentYapilacakIsDetayBinding;
import com.example.todoapp.entity.Yapilacaklar;
import com.example.todoapp.viewmodel.YapilacakIsDetayFragmentViewModel;
import com.example.todoapp.viewmodel.YapilacakIsDetayVMF;

public class YapilacakIsDetayFragment extends Fragment {
    private FragmentYapilacakIsDetayBinding tasarim;
    private YapilacakIsDetayFragmentViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_yapilacak_is_detay, container, false);
        tasarim.setYapilacakDetayFragment(this);
        tasarim.setYapilacakDetayToolbarBaslik("Yapılacak İş Detay");

        YapilacakIsDetayFragmentArgs bundle = YapilacakIsDetayFragmentArgs.fromBundle(getArguments());
        Yapilacaklar gelenIs = bundle.getIs();
        tasarim.setYapilacakNesnesi(gelenIs);

        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this,
                new YapilacakIsDetayVMF(requireActivity().getApplication())).get(YapilacakIsDetayFragmentViewModel.class);
    }

    public void buttonGuncelle(int yapilacak_id, String yapilacak_is){
        viewModel.guncelle(yapilacak_id,yapilacak_is);
    }
}