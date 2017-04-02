package JAVA_rx1;

import android.text.LoginFilter;
import android.util.Log;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/4/2.
 */

public class RxJavaUtils {
    public static String TAG=RxJavaUtils.class.getSimpleName();
    public static void invail(){
        int[] num={1,2,3,4,5,6,7,8,9};
        Observable observable=Observable.interval(1,1, TimeUnit.SECONDS);
        observable.subscribe(new Action1() {
            @Override
            public void call(Object o) {
                Log.i(TAG, "call: "+o.toString());
            }
        });
    }
    public static void just(){
        Integer[] num1={1,2,3,4,5};
        Integer[] num2={6,7,8,9,20};
        Observable observable2=Observable.just(num1,num2);
        observable2.subscribe(new Subscriber<Integer[]>() {
            @Override
            public void onCompleted() {
                Log.i(TAG,"oncompeted");
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG,e.getMessage());
            }

            @Override
            public void onNext(Integer[] o) {
                for(int i=0;i<o.length;i++){
                    Log.i(TAG, "onNext: "+o[i]);
                }
            }
        });
    }

    public static void rang(){
        Observable observale=Observable.range(1,40);
        observale.subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer o) {
                Log.i(TAG, "onNext: "+o.toString());
            }
        });
    }
    public static void filter(){
        Observable observale=Observable.just(1,2,3,4,5,6,7,8,9);
        observale.filter(new Func1<Integer,Boolean>(){
            @Override
            public Boolean call(Integer o) {
                return o<3;
            }
        }).observeOn(Schedulers.io()).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Log.i(TAG, "onCompleted: ");
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "onError: ");
            }

            @Override
            public void onNext(Integer o) {
                Log.i(TAG, "onNext: "+o.toString());
            }
        });

    }
}



