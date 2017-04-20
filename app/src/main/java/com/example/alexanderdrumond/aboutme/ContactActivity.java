package com.example.alexanderdrumond.aboutme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView paginaweb = (TextView) findViewById(R.id.PaginaWeb);
        final TextView telefono = (TextView) findViewById(R.id.Telefono);
        View fragment = findViewById(R.id.emailFragment);

        paginaweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gopaginaweb = new Intent(Intent.ACTION_VIEW);
                gopaginaweb.setData(Uri.parse("https://www.facebook.com/strattonhousechile"));
                startActivity(gopaginaweb);
                //¿Como hacer que abra directamente una pagina dentro de la app de Facebook?
            }
        });

        telefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel" + "+56996709460"));
                startActivity(callintent);
            }
        });

    }
}
