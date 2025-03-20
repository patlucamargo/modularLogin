package com.example.modularloginmvc1.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.modularloginmvc1.datamodel.UsuarioDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    SQLiteDatabase db;
    public static final String nome = "projetoTamplete";
    public static final int version = 1;

    public AppDataBase(Context context) {
        super(context, nome, null, version);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(UsuarioDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
