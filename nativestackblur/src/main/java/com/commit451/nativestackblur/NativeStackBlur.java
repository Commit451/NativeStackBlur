package com.commit451.nativestackblur;

import android.graphics.Bitmap;

import com.enrique.stackblur.NativeBlurProcess;

/**
 * Created by John on 9/10/15.
 */
public class NativeStackBlur {

    /**
     * Process the image using a native library
     */
    public static Bitmap process(Bitmap bitmap, int radius) {
        NativeBlurProcess blur = new NativeBlurProcess();
        return blur.blur(bitmap, radius);
    }
}
