package cc.penrose.custom_typeface.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import cc.penrose.custom_typeface.MyApplication;

/**
 * Created by zhangheilong on 15/5/14.
 */
public class MyEditTextView extends EditText {
    public MyEditTextView(Context context) {
        super(context);
        setTypeface(MyApplication.getInstace().getTypeface());
    }

    public MyEditTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(MyApplication.getInstace().getTypeface());
    }

    public MyEditTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(MyApplication.getInstace().getTypeface());
    }
}
