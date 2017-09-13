package tk.thinkerzhangyan.optimization.SingleInstance;

/**
 * Created by macbook on 2017/9/12.
 */

public class SingleInstanceC {

    private SingleInstanceC() {

    }

    private static SingleInstanceC mSingleInstanceC;

    public static SingleInstanceC getInstance(){
        if(mSingleInstanceC==null){
            synchronized (SingleInstanceC.class){
                if(mSingleInstanceC==null)
                    mSingleInstanceC = new SingleInstanceC();
            }
        }
        return mSingleInstanceC;
    }


}
