package com.kazarian.android.sematech_tir_1401_1;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class VazirTextView extends AppCompatTextView {
    public VazirTextView(@NonNull Context context) {
        super(context);
    }

    public VazirTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "Vazirmatn-Regular.ttf");
        this.setTypeface(typeface);
    }
}
