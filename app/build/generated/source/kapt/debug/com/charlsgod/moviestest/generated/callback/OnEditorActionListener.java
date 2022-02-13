package com.charlsgod.moviestest.generated.callback;
public final class OnEditorActionListener implements android.widget.TextView.OnEditorActionListener {
    final Listener mListener;
    final int mSourceId;
    public OnEditorActionListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public boolean onEditorAction(android.widget.TextView callbackArg_0, int callbackArg_1, android.view.KeyEvent callbackArg_2) {
        return mListener._internalCallbackOnEditorAction(mSourceId , callbackArg_0, callbackArg_1, callbackArg_2);
    }
    public interface Listener {
        boolean _internalCallbackOnEditorAction(int sourceId , android.widget.TextView callbackArg_0, int callbackArg_1, android.view.KeyEvent callbackArg_2);
    }
}