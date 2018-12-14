package pt.ipleiria.enutrideal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import pt.ipleiria.enutrideal.model.ListaRefeicoes;
import pt.ipleiria.enutrideal.model.Refeicao;

public class MainActivity extends AppCompatActivity {

    private ListaRefeicoes lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.lista = new ListaRefeicoes();

        Refeicao r1 = new Refeicao("Restaurante", "item", "quantidade", "calorias kcal");

        this.lista.addRefeicao(r1);

        TextView textView_refeicoes = findViewById(R.id.textView_refeicoes);
        textView_refeicoes.setText(this.lista.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void onClick_SearchItem(MenuItem item) {
        Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show();
    }


}
