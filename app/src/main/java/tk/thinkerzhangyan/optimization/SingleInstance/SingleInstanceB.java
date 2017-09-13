package tk.thinkerzhangyan.optimization.SingleInstance;

/**
 * Created by macbook on 2017/9/12.
 */

public class SingleInstanceB {

    private SingleInstanceB(){}

    private static SingleInstanceB mSingleInstanceB;

    public static synchronized SingleInstanceB getInstance(){
        if(mSingleInstanceB ==null)
            mSingleInstanceB = new SingleInstanceB();

        return mSingleInstanceB;
    }
}
