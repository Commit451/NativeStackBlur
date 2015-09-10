package com.commit451.nativestackblur;

import android.graphics.Bitmap;

import com.enrique.stackblur.NativeBlurProcess;

/**
 * Processes bitmaps using native StackBlur library
 * Created by John on 9/10/15.
 */
public class NativeStackBlur {

    /**
     * Process the bitmap natively
     * @param bitmap the bitmap to apply blur to
     * @param radius the radius of the blur
     * @return a blurred bitmap
     */
    public static Bitmap process(Bitmap bitmap, int radius) {
        NativeBlurProcess blur = new NativeBlurProcess();
        return blur.blur(bitmap, radius);
    }
}
