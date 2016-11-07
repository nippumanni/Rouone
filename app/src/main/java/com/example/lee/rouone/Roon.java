package com.example.lee.rouone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Roon extends AppCompatActivity {
    Button b;
Intent i,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roon);
    }

public void ll(View v)
{
    Intent i = null;
    Intent c= null;
    if(v.getId()== R.id.button)

    {
        i =new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:11,22"));
        startActivity(i);
        c= Intent.createChooser(i,"maps launched");
        startActivity(c);


    }
    public void man()
    {
        System.out.println("ddd");
    }
}





}