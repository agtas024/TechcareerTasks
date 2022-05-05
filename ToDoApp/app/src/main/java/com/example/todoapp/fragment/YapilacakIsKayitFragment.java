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
import com.example.todoapp.databinding.FragmentYapilacakIsKayitBinding;
import com.example.todoapp.viewmodel.YapilacakIsDetayVMF;
import com.example.todoapp.viewmodel.YapilacakIsKayitFragmentViewModel;
import com.example.todoapp.viewmodel.YapilacakIsKayitVMF;
import com.example.todoapp.viewmodel.YapilacaklarVMF;

public class YapilacakIsKayitFragment extends Fragment {
    private FragmentYapilacakIsKayitBinding tasarim;
    private YapilacakIsKayitFragmentViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_yapilacak_is_kayit, container, false);
        tasarim.setYapilacakKayitFragment(this);
        tasarim.setYapilacakKayitToolbarBaslik("Yapılacak İş Kayıt");
        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this,
                new YapilacakIsKayitVMF(requireActivity().getApplication())).get(YapilacakIsKayitFragmentViewModel.class);
    }

    public void buttonKaydetTikla(String yapilacak_is){
        viewModel.kayit(yapilacak_is);
    }
}