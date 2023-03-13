package jesus.uribe.dispositivos.aplicacion_con_intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla_2 extends AppCompatActivity {

    String TAG = "Depuracion";
    EditText Valor1Text, Valor2Text;
    TextView resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Valor1Text = findViewById(R.id.Valor1);
        Valor2Text = findViewById(R.id.Valor2);
        resultadoFinal = findViewById(R.id.result);
        //obtengo de lo recibido el dato (un string que se envio)
        String result = getIntent().getStringExtra("Elresultado");
        String result1 = getIntent().getStringExtra("LlamarValor1");
        String result2 = getIntent().getStringExtra("LlamarValor2");
        publicarDatos(result, result1, result2);

    }
    public void publicarDatos(String result, String LlamarValor1, String LlamarValor2){
        resultadoFinal.setText(result);
       Valor1Text.setText(LlamarValor1);
        Valor2Text.setText(LlamarValor2);
    }

}