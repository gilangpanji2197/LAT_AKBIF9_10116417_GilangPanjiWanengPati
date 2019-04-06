package app.com.lat_akbif9_10116417_gilangpanjiwanengpati;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class main3 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "app.com.lat_akb_if9_10116405_fahrihfatahilah";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }
    public void masuk3 (View view){
        Intent intent = new Intent(this,main4.class);
        EditText editnama = (EditText)findViewById(R.id.txtnama);
        EditText editumur = (EditText)findViewById(R.id.txtumur);
        String message = editnama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }
}
