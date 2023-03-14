package jesus.uribe.dispositivos.aplicacion_con_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "Depuracion";
    EditText Valor1Text, Valor2Text;
    TextView Resultado;
    Button Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Estoy en onCreate");
        Valor1Text = findViewById(R.id.Valor1);
        Valor2Text = findViewById(R.id.Valor2);
        Resultado = findViewById(R.id.resultado);
        Calcular = findViewById(R.id.calcular);
    }
    @Override
    protected void onStart () {
        super.onStart();
        Log.i(TAG, "Estoy en OnStart");
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoActivity2(view);

            }
        });
    }
    @Override
    protected void onRestart () {
        super.onRestart();
        Log.i(TAG, "Estoy en onRestart");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.i(TAG, "Estoy en onResume");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.i(TAG, "Estoy en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Estoy en OnStop");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.i(TAG, "Estoy en onDestroy");
    }
    public void gotoActivity2(View View){
        float result = Float.parseFloat(Valor1Text.getText().toString()) * Float.parseFloat(Valor2Text.getText().toString());
        String Val1 = Valor1Text.getText().toString();
        String Val2 = Valor2Text.getText().toString();
        String Igual = Resultado.getText().toString();

        if (!Val1.isEmpty() && !Val2.isEmpty()){
            Intent pasarDato = new Intent(this,Pantalla_2.class);
            pasarDato.putExtra("Elresultado", String.valueOf(result));
            pasarDato.putExtra("LlamarValor1",Val1);
            pasarDato.putExtra("LlamarValor2",Val2);
            startActivity(pasarDato);
        }else{
            Toast.makeText(MainActivity.this, "Favor llenar todos los datos", Toast.LENGTH_SHORT).show();
        }

    }

}