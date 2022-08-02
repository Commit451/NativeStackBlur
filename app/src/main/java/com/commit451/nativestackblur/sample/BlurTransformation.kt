package com.commit451.nativestackblur.sample

import android.graphics.Bitmap
import coil.size.Size
import coil.transform.Transformation
import com.commit451.nativestackblur.NativeStackBlur

class BlurTransformation @JvmOverloads constructor(
    private val radius: Int = DEFAULT_RADIUS
) : Transformation {

    @Suppress("NullableToStringCall")
    override val cacheKey = "${BlurTransformation::class.java.name}-$radius"

    override suspend fun transform(input: Bitmap, size: Size): Bitmap {
        return NativeStackBlur.process(input, radius)
    }

    private companion object {
        private const val DEFAULT_RADIUS = 10
    }
}