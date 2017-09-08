package com.example.shreydhungana.bullseye;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyActivity extends Activity {
    BullsEyeView bullsEyeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this window wil not feature a title

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bullsEyeView = new BullsEyeView(this);
        setContentView(bullsEyeView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }
    @Override

     public boolean onOptionsItemSelected(MenuItem item) {

       int id = item.getItemId();
        //if (id == R.id.action_settings) {

         //   return true;


        return super.onOptionsItemSelected(item);










    }
}
