package com.example.todoapp.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todoapp.entity.Yapilacaklar;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface YapilacaklarDao {
    @Query("SELECT * FROM tablom")
    Single<List<Yapilacaklar>> tumYapilacaklar();

    @Insert
    Completable yapilacakEkle(Yapilacaklar yapilacak);

    @Update
    Completable yapilacakGuncelle(Yapilacaklar yapilacak);

    @Delete
    Completable yapilacakSil(Yapilacaklar yapilacak);

    @Query("SELECT * FROM tablom WHERE yapilacak_is like '%' || :aramaKelimesi || '%'")
    Single<List<Yapilacaklar>> yapilacakArama(String aramaKelimesi);
}

