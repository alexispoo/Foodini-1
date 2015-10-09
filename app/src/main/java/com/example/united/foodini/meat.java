package com.example.united.foodini;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class meat extends AppCompatActivity {
    // Create a constant for the setting that you're saving
    private static final String SETTING_CHECK_BOX = "checkbox_setting";
    private CheckBox mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);
        mCheckBox = (CheckBox) findViewById(R.id.checkBox1);


        // Set the initial state of the check box based on saved value
        //  ??
        mCheckBox.setChecked(isCheckedSettingEnabled());

    }

    @Override
    public void onPause() {
        super.onPause();

        // Persist the setting. Could also do this with an OnCheckedChangeListener.
        //
        setCheckedSettingEnabled(mCheckBox.isChecked());

    }

    /**
     * Returns true if the setting has been saved as enabled,
     * false by default
     */
    private boolean isCheckedSettingEnabled() {
        return PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean(SETTING_CHECK_BOX, false);

    }

    /**
     * Persists the new state of the setting
     *
     * @param enabled the new state for the setting
     */
    private void setCheckedSettingEnabled(boolean enabled) {
        PreferenceManager.getDefaultSharedPreferences(this)
                .edit()
                .putBoolean(SETTING_CHECK_BOX, enabled)
                .apply();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_meat, menu);
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
    public void inv1(View view) {
        Intent gimcrack = new Intent(this,Inventario.class);

        startActivity(gimcrack);
    }
    public void regresar(View view) {

        Intent getnameback = new Intent(this,Inventario.class);

        startActivity(getnameback);
    }
}
