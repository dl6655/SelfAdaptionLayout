package com.dingli.selfadaptionlayout.attr;

import android.view.View;

/**
 * Created by dingli on 2015/12/28.
 */
public class PaddingAttr extends AutoAttr {
    public PaddingAttr(int pxVal, int baseWidth, int baseHeight)
    {
        super(pxVal, baseWidth, baseHeight);
    }

    @Override
    protected int attrVal()
    {
        return Attrs.PADDING;
    }

    @Override
    public void apply(View view)
    {
        int l, t, r, b;
        if (useDefault())
        {
            l = r = getPercentWidthSize();
            t = b = getPercentHeightSize();
            view.setPadding(l, t, r, b);
            return;
        }
        super.apply(view);
    }

    @Override
    protected boolean defaultBaseWidth()
    {
        return false;
    }

    @Override
    protected void execute(View view, int val)
    {
        view.setPadding(val, val, val, val);
    }
}
