package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Redefinir_senha extends AppCompatActivity {

    private View voltarMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redefinir_senha);

        Button voltarMain = findViewById(R.id.voltarMain);


        }


    public void voltarMain(View view) {

        voltarMain.setOnClickListener(v -> {
            // Código a ser executado quando o botão for clicado
            Toast.makeText(getApplicationContext(), "Enviamos um email para recuperação!", Toast.LENGTH_LONG).show();

            // Iniciar a nova atividade
            Intent intent = new Intent(Redefinir_senha.this, MainActivity.class);
            startActivity(intent);
        });
    }
}







