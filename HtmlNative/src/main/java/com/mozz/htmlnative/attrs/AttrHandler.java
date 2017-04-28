package com.mozz.htmlnative.attrs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.mozz.htmlnative.DomElement;

/**
 * @author Yang Tao, 17/2/22.
 */

public abstract class AttrHandler {
    public abstract void apply(Context context, View v, DomElement domElement, View parent,
                               ViewGroup.LayoutParams layoutParams, String params, Object value,
                               boolean isParent) throws AttrApplyException;

    public void setDefault(Context context, View v, DomElement domElement, ViewGroup.LayoutParams
            layoutParams, View parent) throws AttrApplyException {

    }
}
