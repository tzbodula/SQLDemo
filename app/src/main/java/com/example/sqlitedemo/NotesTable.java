package com.example.sqlitedemo;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class NotesTable {
    static final String TABLE_NAME = "notes";
    static final String COLUMN_ID = "_id";
    static final String COLUMN_SUBJECT = "subject";
    static final String COLUMN_TEXT = "notes";

    static public void onCreate(SQLiteDatabase db) {
        StringBuilder sb = new StringBuilder();

        //CREATE TABLE notes (_id integer primary key autoincrement, subject text not null, note text not null)
        sb.append("CREATE TABLE" + NotesTable.TABLE_NAME + " (");
        sb.append(COLUMN_ID + " integer primary key autoincrement, ");
        sb.append(COLUMN_SUBJECT + " text not null, ");
        sb.append(COLUMN_TEXT + " text not null); ");


        try {
            db.execSQL(sb.toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    static public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.execSQL("DROP TABLE IF EXISTS " + NotesTable.TABLE_NAME);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

