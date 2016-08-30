package mx.alnegasoft.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //public int latitud, longitud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapaLondres(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("latitud", 51.500833);
        i.putExtra("longitud", -0.124444);
        i.putExtra("nombre", "Londres");
        i.putExtra("icono", R.drawable.big_ben);
        startActivity(i);
    }

    public void irMapaParis(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("latitud", 48.858333);
        i.putExtra("longitud", 2.294444);
        i.putExtra("nombre", "Paris");
        i.putExtra("icono", R.drawable.eiffel_tower);
        startActivity(i);
    }

    public void irMapaRoma(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("latitud", 41.890169);
        i.putExtra("longitud", 12.492269);
        i.putExtra("nombre", "Roma");
        i.putExtra("icono", R.drawable.colosseum);
        startActivity(i);
    }

    public void irMapaMadrid(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("latitud", 40.419272);
        i.putExtra("longitud", -3.693125);
        i.putExtra("nombre", "Madrid");
        i.putExtra("icono", R.drawable.spain);
        startActivity(i);
    }

}
