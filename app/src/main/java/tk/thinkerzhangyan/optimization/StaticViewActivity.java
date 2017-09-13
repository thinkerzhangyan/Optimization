package tk.thinkerzhangyan.optimization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tk.thinkerzhangyan.optimization.R;

public class StaticViewActivity extends AppCompatActivity {

    private static View mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_view);

        mView = new View(this);
    }
}
