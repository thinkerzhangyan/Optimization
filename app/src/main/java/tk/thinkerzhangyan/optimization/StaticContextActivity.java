package tk.thinkerzhangyan.optimization;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StaticContextActivity extends AppCompatActivity {

    private static Context sContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static);

        sContext = this;
    }
}
