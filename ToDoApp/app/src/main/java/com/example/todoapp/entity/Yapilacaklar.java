package com.example.todoapp.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "tablom")
public class Yapilacaklar implements Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "yapilacak_id")
    @NonNull
    private int yapilacak_id;
    @ColumnInfo(name = "yapilacak_is")
    @NonNull
    private String yapilacak_is;

    public Yapilacaklar(int yapilacak_id, @NonNull String yapilacak_is) {
        this.yapilacak_id = yapilacak_id;
        this.yapilacak_is = yapilacak_is;
    }

    public Yapilacaklar() {
    }

    public int getYapilacak_id() {
        return yapilacak_id;
    }

    public void setYapilacak_id(int yapilacak_id) {
        this.yapilacak_id = yapilacak_id;
    }

    @NonNull
    public String getYapilacak_is() {
        return yapilacak_is;
    }

    public void setYapilacak_is(@NonNull String yapilacak_is) {
        this.yapilacak_is = yapilacak_is;
    }
}
