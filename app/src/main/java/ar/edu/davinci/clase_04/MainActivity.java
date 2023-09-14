package ar.edu.davinci.clase_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout content = (LinearLayout) findViewById(R.id.content);

        TextView primerTexto = new TextView(this);
        primerTexto.setText("Primer elemento de la lista");
        content.addView(primerTexto);

        TextView segundoTexto = new TextView(this);
        segundoTexto.setText("Segundo elemento de la lista");
        content.addView(segundoTexto);

    }
}