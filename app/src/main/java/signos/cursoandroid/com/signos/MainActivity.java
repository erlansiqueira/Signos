package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView listaSigno;
    private String[] signos = {
      "Aries", "Touro", "Gemeos", "Camcer", "Leao", "Virgem", "Libra",
            "Escorpiao", "Sagitario", "Capricornio", "Aquario", "Peixes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSigno = (ListView) findViewById(R.id.ListSignoId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSigno.setAdapter(adaptador);


    }
}
