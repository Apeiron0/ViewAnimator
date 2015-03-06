package com.example.victor.viewanimator2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewAnimator;


public class MainActivity extends ActionBarActivity {

    ViewAnimator animo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animo=(ViewAnimator)findViewById(R.id.animacion);
        final Animation inanim= AnimationUtils.loadAnimation(this,R.anim.abc_slide_in_top);
        final Animation outanim=AnimationUtils.loadAnimation(this,R.anim.abc_fade_out);

        animo.setInAnimation(inanim);
        animo.setOutAnimation(outanim);

        animo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animo.showNext();
            }
        });

        Button btn1=(Button)findViewById(R.id.btnnext);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animo.showNext();
            }
        });

        Button btn2=(Button)findViewById(R.id.btprev);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animo.showPrevious();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

