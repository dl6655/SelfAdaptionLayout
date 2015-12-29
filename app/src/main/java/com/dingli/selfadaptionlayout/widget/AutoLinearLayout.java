package com.dingli.selfadaptionlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.dingli.selfadaptionlayout.utils.AutoLayoutHelper;

/**
 * Created by dingli on 2015/12/28.
 */
public class AutoLinearLayout extends LinearLayout {
    private AutoLayoutHelper mHelper = new AutoLayoutHelper(this);

    public AutoLinearLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)

    {
        if (!isInEditMode())
            mHelper.adjustChildren();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.i("AAAD","AutoLinearLayout onMeasure");
    }


    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b)
    {
        super.onLayout(changed, l, t, r, b);
        Log.i("AAAD","AutoLinearLayout onLayout");
    }


    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs)
    {
        Log.i("AAAD","AutoLinearLayout generateLayoutParams");
        return new AutoLinearLayout.LayoutParams(getContext(), attrs);
    }


    public static class LayoutParams extends LinearLayout.LayoutParams
            implements AutoLayoutHelper.AutoLayoutParams
    {
        private AutoLayoutInfo mAutoLayoutInfo;

        public LayoutParams(Context c, AttributeSet attrs)
        {
            super(c, attrs);
            mAutoLayoutInfo = AutoLayoutHelper.getAutoLayoutInfo(c, attrs);
        }

        @Override
        public AutoLayoutInfo getAutoLayoutInfo()
        {
            return mAutoLayoutInfo;
        }


        public LayoutParams(int width, int height)
        {
            super(width, height);
        }


        public LayoutParams(ViewGroup.LayoutParams source)
        {
            super(source);
        }

        public LayoutParams(MarginLayoutParams source)
        {
            super(source);
        }

    }
}
