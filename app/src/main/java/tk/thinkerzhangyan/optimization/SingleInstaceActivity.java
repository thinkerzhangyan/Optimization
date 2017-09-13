package tk.thinkerzhangyan.optimization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tk.thinkerzhangyan.optimization.SingleInstance.TestManager;

public class SingleInstaceActivity extends AppCompatActivity implements TestManager.OnDataArrivedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instace);

        TestManager.getInstance().registeListener(this);
    }

    @Override
    public void onDataArrived(Object object) {

    }
}
