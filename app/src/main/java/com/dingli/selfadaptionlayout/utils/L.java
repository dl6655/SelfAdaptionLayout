package com.dingli.selfadaptionlayout.utils;

import android.util.Log;

/**
 * Created by dingli on 2015/12/28.
 */
public class L {
    public static boolean debug = false;
    private static final String TAG = "AUTO_LAYOUT";

    public static void e(String msg)
    {
        if (debug)
        {
            Log.e(TAG, msg);
        }
    }
}
