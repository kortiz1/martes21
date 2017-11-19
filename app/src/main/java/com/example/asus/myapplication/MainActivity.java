package com.example.asus.myapplication;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcionesprin);
        lv = (ListView) findViewById(R.id.opc_prin);
        resources = this.getResources();
        opc = resources.getStringArray(R.array.Menu_P);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                      @Override
                                      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                          switch (i) {

                                              case 0:
                                                  in = new Intent(MainActivity.this, Vp.class);
                                                  startActivity(in);
                                                  break;
                                              case 1:
                                                  in = new Intent(MainActivity.this, Vd.class);
                                                  startActivity(in);
                                                  break;
                                              case 2:
                                                  in = new Intent(MainActivity.this, Vm.class);
                                                  startActivity(in);
                                                  break;
                                              case 3:
                                                  in = new Intent(MainActivity.this, Rb.class);
                                                  startActivity(in);
                                                  break;

                                          }

                                      }
                                  }
        );


    }
}