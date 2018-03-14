package com.refreshx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2018/3/14.
 */
public class MainAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.id1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainAct.this, MainActivity1.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.id2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainAct.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.id3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainAct.this, XListViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
