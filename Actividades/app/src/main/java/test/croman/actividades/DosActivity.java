package test.croman.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DosActivity extends AppCompatActivity {
    private static final String TAG = "TAG-";
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        //TODO: Acordar al profe del flujo de actividad
        btnVolver = findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        Bundle b = getIntent().getExtras();

        if (b != null){
            String usuario = b.getString("usr", "Usuario no recibido");
            int edad = b.getInt("edad", -1);

            Log.d("TAG-" , "Usuario : " + usuario + ",edad : " + edad);
        }
    }
}
