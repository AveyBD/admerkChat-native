/*
 * Copyright 2023 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.admerkcorp.glide.common.loader;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: 从Asset中读取流
 * @Author: pengfei.zhou
 * @CreateDate: 2019/3/28
 */
public class AssetStreamLoader extends StreamLoader {

    private final Context mContext;
    private final String mAssetName;

    public AssetStreamLoader(Context context, String assetName) {
        mContext = context.getApplicationContext();
        mAssetName = assetName;
    }

    @Override
    protected InputStream getInputStream() throws IOException {
        return mContext.getAssets().open(mAssetName);
    }
}
