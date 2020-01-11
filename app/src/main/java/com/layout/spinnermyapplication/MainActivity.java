package com.layout.spinnermyapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener{

    TextView selection;
    String[] items={"item1","item2","item3","item4","item5","item6","item7","item8","item9","item10"};
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        selection=(TextView) findViewById(R.id.selection);

        Spinner spin=(Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,items);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        selection.setText(items[position]);
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        selection.setText("");
    }

}
