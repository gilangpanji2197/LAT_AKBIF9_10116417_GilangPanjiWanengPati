package app.com.lat_akbif9_10116417_gilangpanjiwanengpati;

import android.content.Intent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class main4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        String message = intent.getStringExtra(main3.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.txt2);
        textView.setText(message);

    }
    public void keluar(View view){

    }
}
