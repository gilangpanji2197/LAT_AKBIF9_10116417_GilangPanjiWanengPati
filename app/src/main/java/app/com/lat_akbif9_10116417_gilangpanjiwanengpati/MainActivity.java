package app.com.lat_akbif9_10116417_gilangpanjiwanengpati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void masuk (View view){
        Intent intent = new Intent(MainActivity.this,main2.class);
        startActivity(intent);
    }
}

