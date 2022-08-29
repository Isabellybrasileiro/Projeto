package br.com.up.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutNumber;
    private TextInputLayout inputLayoutTxt;

    private TextInputEditText inputTextNumber;
    private TextInputEditText inputTextTxt;

    private Button buttonEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputLayoutNumber = findViewById(R.id.input_layout_number);
        inputLayoutTxt = findViewById(R.id.input_layout_txt);

        inputTextNumber = findViewById(R.id.input_text_number);
        inputTextTxt = findViewById(R.id.input_text_txt);


        buttonEnviar = findViewById(R.id.button_enviar);

        buttonEnviar.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        String number = inputTextNumber.getText().toString();
                        String text = inputTextTxt.getText().toString();
                        Uri webpage = Uri.parse("https://wa.me/"+number+"/?text=" +text);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                        startActivity(webIntent);
                    }
                }
        );



    }

}