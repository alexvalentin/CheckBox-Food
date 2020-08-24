package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    int number=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.search:
                Toast.makeText(MainActivity.this,"Searching", Toast.LENGTH_SHORT).show();
            return true;

            case R.id.help:
                Toast.makeText(MainActivity.this,"Helping", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.logout:
                Toast.makeText(MainActivity.this,"Pa pa!", Toast.LENGTH_SHORT).show();
            default: return super.onOptionsItemSelected(item);
        }
    }

        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isSelected1=checkBox1.isChecked();
                if(isSelected1){
                    Toast.makeText(MainActivity.this, "Ai selectat KFC!", Toast.LENGTH_SHORT).show();
                }
                else
                {Toast.makeText(MainActivity.this, "Nu mai doresc KFC!",Toast.LENGTH_SHORT).show();
                }

                boolean isSelected2=checkBox2.isChecked();
                if(isSelected2){
                    Toast.makeText(MainActivity.this, "Ai selectat McDonalds!", Toast.LENGTH_SHORT).show();
                }
                else
                {Toast.makeText(MainActivity.this, "Nu mai vreau McDonalds!",Toast.LENGTH_SHORT).show();
                }

                boolean isSelected3=checkBox3.isChecked();
                if(isSelected3){
                    Toast.makeText(MainActivity.this, "Ai selectat McDonalds!", Toast.LENGTH_SHORT).show();
                }
                else
                {Toast.makeText(MainActivity.this, "Nu mai vreau McDonalds!",Toast.LENGTH_SHORT).show();
                }

                boolean isSelected4=checkBox4.isChecked();
                if(isSelected4){
                    Toast.makeText(MainActivity.this, "Ai selectat La Grecu Braila!", Toast.LENGTH_SHORT).show();
                }
                else
                {Toast.makeText(MainActivity.this, "Nu mai vreau La Grecu!",Toast.LENGTH_SHORT).show();
                }

                if(isSelected1 && isSelected2){
                    Toast.makeText(MainActivity.this, "Ai selectat ambele magazine!", Toast.LENGTH_SHORT).show();
                }
                else
                {Toast.makeText(MainActivity.this, "Nu mai vreau de mancare!",Toast.LENGTH_SHORT).show();
                }*/

        public void onCheckboxClicked(View view) {
               //Is the view now checked?
                boolean checked = ((CheckBox)view).isChecked();


                //Check which checbox was clicked
                if (view.getId() == R.id.checkBox1) {
                    if (checked)
                      Toast.makeText(MainActivity.this,"Doresc KFC", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this,"Nu doresc KFC", Toast.LENGTH_SHORT).show();
                }

                if (view.getId() == R.id.checkBox2) {
                    if (checked)
                        Toast.makeText(MainActivity.this, "Doresc MC Donalds", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this,"Nu doresc Mec", Toast.LENGTH_SHORT).show();
                }

                 if (view.getId() == R.id.checkBox3) {
                    if (checked) {
                        Toast.makeText(MainActivity.this, "Doresc sa comand de la Restaurant Carol!", Toast.LENGTH_SHORT).show();
                        number++;
                    }
                    else
                        Toast.makeText(MainActivity.this,"Nu am bani de Carol!", Toast.LENGTH_SHORT).show();
                }

                 if (view.getId() == R.id.checkBox4) {
                    if (checked)
                        Toast.makeText(MainActivity.this, "Doresc sa comand de la La Grecu!", Toast.LENGTH_SHORT).show();
                    else
                    Toast.makeText(MainActivity.this,"Nu mai doresc La Grecu!", Toast.LENGTH_SHORT).show();
              }
            }
    }
