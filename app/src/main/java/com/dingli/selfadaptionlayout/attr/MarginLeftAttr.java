package com.dingli.selfadaptionlayout.attr;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dingli on 2015/12/28.
 */
public class MarginLeftAttr extends AutoAttr {
    public MarginLeftAttr(int pxVal, int baseWidth, int baseHeight)
    {
        super(pxVal, baseWidth, baseHeight);
    }

    @Override
    protected int attrVal()
    {
        return Attrs.MARGIN_LEFT;
    }

    @Override
    protected boolean defaultBaseWidth()
    {
        return true;
    }

    @Override
    protected void execute(View view, int val)
    {
        if(!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams))
        {
            return ;
        }
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        lp.leftMargin = val;
    }
}
