package edu.xula.xuttle.xuttleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class PickUp extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        String[] words = getResources().getStringArray(R.array.auto_complete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        autoCompleteTextView.setAdapter(adapter);
        findViewById(R.id.Popeyes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PickUp.this, MapXuttle.class);
                PickUp.this.startActivity(myIntent);
            }
        });
    }


}
