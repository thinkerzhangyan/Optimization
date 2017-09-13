package tk.thinkerzhangyan.optimization;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AnimatorActivity extends AppCompatActivity {

    private TextView mTextView;

    private ObjectAnimator objectAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);


        mTextView = (TextView) findViewById(R.id.textView);
        objectAnimator = ObjectAnimator.ofFloat(mTextView,"rotation",0,360).setDuration(2000);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //objectAnimator.cancel();
    }
}
