package cc.penrose.custom_typeface;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by zhangheilong on 15/6/2.
 */
public class MyApplication extends Application {
    private Typeface typeface;
    private static MyApplication _instance;

    @Override
    public void onCreate() {
        super.onCreate();
        _instance = (MyApplication) getApplicationContext();
        typeface = Typeface.createFromAsset(_instance.getAssets(), "fonts/mi4.ttf");
    }

    public static  MyApplication getInstace() {
        return _instance;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }
}
