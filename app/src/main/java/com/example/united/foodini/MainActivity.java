package com.example.united.foodini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public boolean checkBox1;
    public boolean checkBox2;
    public boolean checkBox3;
    public boolean checkBox4;
    public boolean checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    }
    public void Goinventario(View view) {
        Intent getNameScreenIntent = new Intent(this,Inventario.class);

        startActivity(getNameScreenIntent);

    }

    public void Gosearch(View view) {
        Intent getNameScreenIntent2 = new Intent(this,Busqueda.class);

        startActivity(getNameScreenIntent2);
    }

    public void Gorecipe(View view) {
        Intent getNameScreenIntent3 = new Intent(this,Recetas.class);

        startActivity(getNameScreenIntent3);
    }

    public void Gonotes(View view) {

            Intent getNameScreenIntent4 = new Intent(this,Notes.class);

            startActivity(getNameScreenIntent4);

    }

}
