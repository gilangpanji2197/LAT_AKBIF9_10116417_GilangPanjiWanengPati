package app.com.lat_akbif9_10116417_gilangpanjiwanengpati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void masuk2 (View view){
        Intent intent = new Intent(main2.this, main3.class);
        startActivity(intent);
    }
}