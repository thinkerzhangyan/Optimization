package tk.thinkerzhangyan.optimization.SingleInstance;

import java.util.ArrayList;

/**
 * Created by macbook on 2017/9/12.
 */

public class TestManager {

    private ArrayList<OnDataArrivedListener> mOnDataArrivedListeners = new ArrayList<>();

    public interface OnDataArrivedListener{
        public void onDataArrived(Object object);
    }

    private TestManager(){}

    private static class SingleInstanceHolder{
        public static final TestManager SINGLEINSTANCE = new TestManager();
    }

    public static TestManager getInstance(){
       return SingleInstanceHolder.SINGLEINSTANCE;
    }

    public  synchronized void registeListener(OnDataArrivedListener onDataArrivedListener){
        if(!mOnDataArrivedListeners.contains(onDataArrivedListener)){
            mOnDataArrivedListeners.add(onDataArrivedListener);
        }
    }
    public synchronized void unregisteListener(OnDataArrivedListener onDataArrivedListener){
        mOnDataArrivedListeners.remove(onDataArrivedListener);
    }

}
