package com.example.formulaire.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.formulaire.R;

public class Resultat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        TextView pseudo = (TextView) findViewById(R.id.editpseudo);
        TextView Mdp= (TextView) findViewById(R.id.editMdp);
        Intent intent =getIntent();
        String v = "";
        if ( intent != null) {
            v = intent.getStringExtra("editTxtUsername");
            pseudo.setText(v);
            v = intent.getStringExtra("editTxtPsw");
            Mdp.setText(v);

        }
    }
}
