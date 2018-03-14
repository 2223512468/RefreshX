package com.refreshx;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity2 extends Activity {


    private PullToRefreshListView lv;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lv = (PullToRefreshListView) findViewById(R.id.mylv);

        List<String> arr = new ArrayList<String>();
        arr.add("jikexueyuan");
        arr.add("eoe");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);

        lv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {

            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {

                new AsyncTask<Void, Void, Void>() {

                    @Override
                    protected Void doInBackground(Void... params) {

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    protected void onPostExecute(Void result) {

                        adapter.addAll("Hello", "大家好");

                        lv.onRefreshComplete();
                    }

                    ;
                }.execute();
            }
        });
    }

}
