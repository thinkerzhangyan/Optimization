package tk.thinkerzhangyan.optimization.SingleInstance;

/**
 * Created by macbook on 2017/9/12.
 */

public class SingleInstanceA {
    private SingleInstanceA(){

    }
    private static SingleInstanceA sSingleInstanceA = new SingleInstanceA();

    public static SingleInstanceA getSingleInstanceA(){
        return sSingleInstanceA;
    }
}
