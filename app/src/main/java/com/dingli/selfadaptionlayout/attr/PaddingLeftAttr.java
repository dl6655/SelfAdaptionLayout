package com.dingli.selfadaptionlayout.attr;

import android.view.View;

/**
 * Created by dingli on 2015/12/28.
 */
public class PaddingLeftAttr extends AutoAttr {
    public PaddingLeftAttr(int pxVal, int baseWidth, int baseHeight)
    {
        super(pxVal, baseWidth, baseHeight);
    }

    @Override
    protected int attrVal()
    {
        return Attrs.PADDING_LEFT;
    }

    @Override
    protected boolean defaultBaseWidth()
    {
        return true;
    }

    @Override
    protected void execute(View view, int val)
    {
        int l = val;
        int t = view.getPaddingTop();
        int r = view.getPaddingRight();
        int b = view.getPaddingBottom();
        view.setPadding(l, t, r, b);

    }
}
