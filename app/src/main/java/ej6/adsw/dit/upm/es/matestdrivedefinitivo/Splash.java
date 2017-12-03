package ej6.adsw.dit.upm.es.matestdrivedefinitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView myImage = (ImageView)findViewById(R.id.imageView);
        TextView twUemCar = (TextView) findViewById(R.id.textView);
        //Animation myanim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.alpha);

        //myImage.startAnimation(myanim);
        twUemCar.startAnimation(myanim2);
        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}
