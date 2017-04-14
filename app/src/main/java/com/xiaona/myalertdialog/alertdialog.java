package com.xiaona.myalertdialog;

import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class alertdialog extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Builder dialog = new AlertDialog.Builder(alertdialog.this);
        dialog.setIcon(android.R.drawable.ic_menu_info_details);
        dialog.setTitle(R.string.title);
        dialog.setMessage("欢迎使用本程序");
        dialog.setPositiveButton("肯定", new OnClickListener() {
            @Override
            public void onClick(DialogInterface a0, int i) {

            }
        });
        dialog.setNegativeButton("否定", new OnClickListener() {
            @Override
            public void onClick(DialogInterface a0, int i) {

            }
        });
        dialog.create();
        dialog.show();
    }
}
