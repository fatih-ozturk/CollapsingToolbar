package com.fatihcamuz.imagetransitioneffect;

import android.graphics.RectF;

public interface TransitionGenerator {
    com.fatihcamuz.imagetransitioneffect.Transition generateNextTransition(RectF drawableBounds, RectF viewport);

}