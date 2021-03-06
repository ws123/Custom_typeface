package cc.penrose.custom_font;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by zhangheilong on 15/5/14.
 */
public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
        setTypeface(MyApplication.getInstace().getTypeface());
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(MyApplication.getInstace().getTypeface());
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(MyApplication.getInstace().getTypeface());
    }

}
