package com.dingli.selfadaptionlayout.attr;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dingli on 2015/12/28.
 */
public class WidthAttr extends AutoAttr {
    public WidthAttr(int pxVal, int baseWidth, int baseHeight)
    {
        super(pxVal, baseWidth, baseHeight);
    }

    @Override
    protected int attrVal()
    {
        return Attrs.WIDTH;
    }

    @Override
    protected boolean defaultBaseWidth()
    {
        return true;
    }

    @Override
    protected void execute(View view, int val)
    {
        ViewGroup.LayoutParams lp = view.getLayoutParams();
        lp.width = val;
    }
}
