package tk.thinkerzhangyan.optimization;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    Button buttonanimator ;
    Button buttonStaticContext;
    Button buttonStaticView;
    Button buttonthread ;
    Button buttonSingleInstance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        setOnClicks();

    }

    private void setOnClicks() {
        buttonthread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThreadActivity.class);
                startActivity(intent);
            }
        });


        buttonStaticContext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StaticContextActivity.class);
                startActivity(intent);
            }
        })  ;

        buttonStaticView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StaticViewActivity.class);
                startActivity(intent);
            }
        });

        buttonanimator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AnimatorActivity.class);
                startActivity(intent);
            }
        });
        buttonSingleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SingleInstaceActivity.class);
                startActivity(intent);
            }
        });
    }

    private void findViews() {
        buttonanimator = (Button) findViewById(R.id.button_animator);
        buttonStaticContext = (Button) findViewById(R.id.button_static_context);
        buttonStaticView = (Button) findViewById(R.id.button_static_view);
        buttonthread = (Button) findViewById(R.id.button_thread);
        buttonSingleInstance = (Button) findViewById(R.id.button_singleinstance);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
