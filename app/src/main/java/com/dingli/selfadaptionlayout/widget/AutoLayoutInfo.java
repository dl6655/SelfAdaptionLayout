package com.dingli.selfadaptionlayout.widget;

import android.view.View;

import com.dingli.selfadaptionlayout.attr.AutoAttr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingli on 2015/12/28.
 */
public class AutoLayoutInfo {
    private List<AutoAttr> autoAttrs = new ArrayList<>();
    public void addAttr(AutoAttr autoAttr)
    {
        autoAttrs.add(autoAttr);
    }


    public void fillAttrs(View view)
    {
        for (AutoAttr autoAttr : autoAttrs)
        {
            autoAttr.apply(view);
        }
    }

    @Override
    public String toString()
    {
        return "AutoLayoutInfo{" +
                "autoAttrs=" + autoAttrs +
                '}';
    }
}
