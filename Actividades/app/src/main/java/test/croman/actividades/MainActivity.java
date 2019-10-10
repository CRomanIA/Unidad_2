package test.croman.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TAG-";
    private Button btnSegundaAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSegundaAct = findViewById(R.id.btnSegundaActividad);

        btnSegundaAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DosActivity.class);
                startActivity(i);
                i.putExtra("usr", "elChe@hotmail.com");
                i.putExtra("edad", 25);

                Log.d(TAG, "Click Boton");
            }
        });
    }
}
