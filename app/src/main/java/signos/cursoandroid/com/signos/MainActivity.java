package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSigno;
    private String[] signos = {
      "Aries", "Touro", "Gemeos", "Camcer", "Leao", "Virgem", "Libra",
            "Escorpiao", "Sagitario", "Capricornio", "Aquario", "Peixes"
    };

    private String[] perfis = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12"


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
        listaSigno.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(), perfis[codigoPosicao], Toast.LENGTH_SHORT).show();

            }
        });



    }
}
