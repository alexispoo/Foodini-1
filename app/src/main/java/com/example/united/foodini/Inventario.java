package com.example.united.foodini;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Inventario extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_inventario);



    }

    public void regresar(View view) {

        Intent getnameback = new Intent(this,MainActivity.class);

        startActivity(getnameback);
    }

    public void Gomeat(View view) {
        Intent gomeat = new Intent(this,meat.class);

        startActivity(gomeat);
    }

    public void Gomilk(View view) {
        Intent gomilk=new Intent(this,Milk.class);
        startActivity(gomilk);
    }

    public void Govegetables(View view) {
        Intent govegetables=new Intent(this,vegetables.class);
        startActivity(govegetables);

    }
}
