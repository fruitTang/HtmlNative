package com.mozz.htmlnativedemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;

import com.mozz.htmlnative.HNViewType;
import com.mozz.htmlnative.view.LayoutParamsCreator;

/**
 * @author Yang Tao, 17/6/6.
 */

public class ImageButtonViewType extends HNViewType<ImageView> {

    @NonNull
    @Override
    public Class<ImageView> getViewClass() {
        return ImageView.class;
    }

    @NonNull
    @Override
    public String getHTMLType() {
        return null;
    }

    @Override
    public void onSetStyle(Context context, View v, View parent, LayoutParamsCreator
            layoutCreator, String styleName, Object style) {

    }

    @Override
    public void onSetDefaultStyle(Context context, View v, LayoutParamsCreator layoutParamsCreator, View parent) {

    }

    @Override
    public ImageView create(Context context) {
        return new ImageView(context);
    }
}
