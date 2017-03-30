package com.commit451.nativestackblur;

import android.graphics.Bitmap;

import com.enrique.stackblur.NativeBlurProcess;

/**
 * Processes bitmaps using native StackBlur library
 */
public class NativeStackBlur {

    /**
     * Blur the bitmap natively, synchronously.
     *
     * @param bitmap the bitmap to apply blur to
     * @param radius the radius of the blur
     * @return a blurred bitmap. If the process fails, it will return the same bitmap as what was
     * passed
     */
    public static Bitmap process(Bitmap bitmap, int radius) {
        NativeBlurProcess blur = new NativeBlurProcess();
        return blur.blur(bitmap, radius);
    }
}
