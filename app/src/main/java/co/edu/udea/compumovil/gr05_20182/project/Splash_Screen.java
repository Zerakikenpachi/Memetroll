package co.edu.udea.compumovil.gr05_20182.project;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

public class Splash_Screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intenet = new Intent(Splash_Screen.this,Main_Activity.class);
                startActivity(intenet);
            }
        },3000);
    }

}
