package com.dingli.selfadaptionlayout.attr;

import android.view.View;

import java.lang.reflect.Method;

/**
 * Created by dingli on 2015/12/28.
 */
public class MaxHeightAttr extends AutoAttr {
    public MaxHeightAttr(int pxVal, int baseWidth, int baseHeight)
    {
        super(pxVal, baseWidth, baseHeight);
    }

    @Override
    protected int attrVal()
    {
        return Attrs.MAX_HEIGHT;
    }

    @Override
    protected boolean defaultBaseWidth()
    {
        return false;
    }

    @Override
    protected void execute(View view, int val)
    {
        try
        {
            Method setMaxWidthMethod = view.getClass().getMethod("setMaxHeight", int.class);
            setMaxWidthMethod.invoke(view, val);
        } catch (Exception ignore)
        {
        }
    }
}
