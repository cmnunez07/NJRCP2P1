package aphm.isc.tesoem.edu.njrcp2p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton visc,vitics,vambiental,vgastro;
    CheckBox casa,escuela,trabajo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visc = (RadioButton) findViewById(R.id.rbIsc);
        vitics = (RadioButton) findViewById(R.id.rbITC);
        vambiental = (RadioButton) findViewById(R.id.brIamb);
        vgastro = (RadioButton) findViewById(R.id.rbIG);

        casa = (CheckBox) findViewById(R.id.checkBox);
        escuela = (CheckBox) findViewById(R.id.checkBox2);
        trabajo = (CheckBox) findViewById(R.id.checkBox3);


    }

    public void seleccion (View view){
        if(visc.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas", Toast.LENGTH_SHORT).show();
        if(vitics.isChecked()) Toast.makeText(this, "Ingenieria en Tecnologa ", Toast.LENGTH_SHORT).show();
        if(vambiental.isChecked()) Toast.makeText(this, "Ingenieria en Ambiental", Toast.LENGTH_SHORT).show();
        if(vgastro.isChecked()) Toast.makeText(this, "Licenciatura en Gastronimia", Toast.LENGTH_SHORT).show();

        if(casa.isChecked()) Toast.makeText(this, "Ocupas internet en Casa", Toast.LENGTH_SHORT).show();
        if(escuela.isChecked()) Toast.makeText(this, "Ocupas internet en la Escuela", Toast.LENGTH_SHORT).show();
        if(trabajo.isChecked()) Toast.makeText(this, "Gorreas en el Trabajo", Toast.LENGTH_SHORT).show();


    }


}
