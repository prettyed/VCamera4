package com.volcanoscar.vcamera.ui;

import android.graphics.SurfaceTexture;

import com.volcanoscar.vcamera.gles.RenderThread;

public class PreviewScreenNail extends SurfaceTextureScreenNail {

    private RenderThread mRenderThread = null;

    public PreviewScreenNail(RenderThread renderThread) {
        mRenderThread = renderThread;
    }

    @Override
    public void noDraw() {

    }

    @Override
    public void recycle() {
        releaseSurfaceTexture();
    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        mRenderThread.getHandler().sendFrameAvailable();
    }
}
