package com.fatihcamuz.imagetransitioneffect;

import android.graphics.RectF;

public final class Utils {

    protected static float truncate(float f, int decimalPlaces) {
        float decimalShift = (float) Math.pow(10, decimalPlaces);
        return Math.round(f * decimalShift) / decimalShift;
    }

    protected static boolean haveSameAspectRatio(RectF r1, RectF r2) {
        float srcRectRatio = Utils.truncate(Utils.getRectRatio(r1), 2);
        float dstRectRatio = Utils.truncate(Utils.getRectRatio(r2), 2);
        return (Math.abs(srcRectRatio-dstRectRatio) <= 0.01f);
    }

    protected static float getRectRatio(RectF rect) {
        return rect.width() / rect.height();
    }
}