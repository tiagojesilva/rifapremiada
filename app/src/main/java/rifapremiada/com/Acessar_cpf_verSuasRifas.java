package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class Acessar_cpf_verSuasRifas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acessar_cpf_ver_suas_rifas);
    }

    public void rifaassinada(View view) {
        Intent intent = new Intent(this, Rifa_assinada.class);
        startActivity(intent);
    }



}