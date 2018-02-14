package com.amritha.acadgild.android_session8_assignment1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

public class MainActivity extends AppCompatActivity {

    ListView monthListView;
    Button buttonAscending;
    Button buttonDescending;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defined ArrayList values to show in ListView
        final ArrayList<String> months = new ArrayList<String>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");


        // Get ListView object from xml
        monthListView = findViewById(R.id.monthListView);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        // Assign adapter to ListView


        // Create an ArrayAdapter from List
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, months) {

            public View getView(int position, View convertView, ViewGroup parent) {
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.WHITE);

                // Generate ListView Item using TextView
                return view;
            }
        };

        monthListView.setAdapter(arrayAdapter);

       /*monthListView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, months));
*/

        // Get Button object from xml
        buttonAscending = findViewById(R.id.buttonAscending);
        buttonDescending = findViewById(R.id.buttonDescending);

        // Button Click Listener
        buttonAscending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.sort(months);

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                        (MainActivity.this, android.R.layout.simple_list_item_1, months) {

                    public View getView(int position, View convertView, ViewGroup parent) {
                        // Get the Item from ListView
                        View view = super.getView(position, convertView, parent);

                        // Initialize a TextView for ListView each Item
                        TextView tv = (TextView) view.findViewById(android.R.id.text1);

                        // Set the text color of TextView (ListView Item)
                        tv.setTextColor(Color.WHITE);

                        // Generate ListView Item using TextView
                        return view;
                    }
                };

                monthListView.setAdapter(arrayAdapter);

                /*monthListView.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_list_item_1,android.R.id.tv, android.R.id.text1, months));*/

            }
        });

        buttonDescending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.sort(months, Collections.reverseOrder());

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                        (MainActivity.this, android.R.layout.simple_list_item_1, months) {

                    public View getView(int position, View convertView, ViewGroup parent) {
                        // Get the Item from ListView
                        View view = super.getView(position, convertView, parent);

                        // Initialize a TextView for ListView each Item
                        TextView tv = (TextView) view.findViewById(android.R.id.text1);

                        // Set the text color of TextView (ListView Item)
                        tv.setTextColor(Color.WHITE);

                        // Generate ListView Item using TextView
                        return view;
                    }
                };

                monthListView.setAdapter(arrayAdapter);

                /*monthListView.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_list_item_1, android.R.id.text1, months));*/

            }
        });

    }

}
