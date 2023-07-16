/*
 * Copyright 2023 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.admerkcorp.glide.common.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description: FileReader
 * @Author: pengfei.zhou
 * @CreateDate: 2019-05-23
 */
public class FileReader extends FilterReader {
    private final File mFile;

    public FileReader(File file) throws IOException {
        super(new StreamReader(new FileInputStream(file)));
        mFile = file;
    }

    @Override
    public void reset() throws IOException {
        reader.close();
        reader = new StreamReader(new FileInputStream(mFile));
    }
}
