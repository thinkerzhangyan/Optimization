package tk.thinkerzhangyan.optimization;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.lang.ref.WeakReference;

public class ThreadActivity extends AppCompatActivity {

    private boolean isRuning = true;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        new MyThread(this).start();
    }

    private void dosomthing() {
        while(isRuning){
            System.out.println("yunxing....");
        }
    }

    private void stop(){
        isRuning=false;
    }

    private static class MyThread extends Thread {
        WeakReference<ThreadActivity> mThreadActivityRef;

        public MyThread(ThreadActivity activity) {
            mThreadActivityRef = new WeakReference<>(
                    activity);
        }

        @Override
        public void run() {
            super.run();
            if (mThreadActivityRef == null)
                return;
            if (mThreadActivityRef.get() != null)
                mThreadActivityRef.get().dosomthing();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // stop();
    }
}
