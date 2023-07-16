/*
 * Copyright 2023 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.admerkcorp.glide;

import androidx.annotation.NonNull;

public final class SignalGlideCodecs {

  private static Log.Provider logProvider = Log.Provider.EMPTY;

  private SignalGlideCodecs() {}

  public static void setLogProvider(@NonNull Log.Provider provider) {
    logProvider = provider;
  }

  public static @NonNull Log.Provider getLogProvider() {
    return logProvider;
  }
}
