package com.dingli.selfadaptionlayout.attr;

import android.view.View;

import java.lang.reflect.Method;

/**
 * Created by dingli on 2015/12/28.
 */
public class MinWidthAttr extends AutoAttr {
    public MinWidthAttr(int pxVal, int baseWidth, int baseHeight)
    {
        super(pxVal, baseWidth, baseHeight);
    }

    @Override
    protected int attrVal()
    {
        return Attrs.MIN_WIDTH;
    }

    @Override
    protected boolean defaultBaseWidth()
    {
        return true;
    }

    @Override
    protected void execute(View view, int val)
    {
        try
        {
            Method setMaxWidthMethod = view.getClass().getMethod("setMinWidth", int.class);
            setMaxWidthMethod.invoke(view, val);
        } catch (Exception ignore)
        {
        }
    }
}
