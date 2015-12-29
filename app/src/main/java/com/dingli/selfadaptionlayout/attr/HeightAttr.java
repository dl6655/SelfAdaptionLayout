package com.dingli.selfadaptionlayout.attr;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dingli on 2015/12/28.
 */
public class HeightAttr extends AutoAttr {
    public HeightAttr(int pxVal, int baseWidth, int baseHeight)
    {
        super(pxVal, baseWidth, baseHeight);
    }

    @Override
    protected int attrVal()
    {
        return Attrs.HEIGHT;
    }

    @Override
    protected boolean defaultBaseWidth()
    {
        return false;
    }

    @Override
    protected void execute(View view, int val)
    {
        ViewGroup.LayoutParams lp = view.getLayoutParams();
        lp.height = val;
    }
}
