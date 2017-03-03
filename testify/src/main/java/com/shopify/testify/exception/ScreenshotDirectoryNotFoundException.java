package com.shopify.testify.exception;

/**
 * Created by danieljette on 15-12-09.
 * Copyright © 2015 Shopify. All rights reserved.
 */
public class ScreenshotDirectoryNotFoundException extends Exception {

    // TODO: This needs to be generic
    public ScreenshotDirectoryNotFoundException(String path) {
        super("\n\n* Could not find path {" + path + "}.\n" +
              "* Check that your emulator has an SD card image and try again.\n" +
              " * Running `script/android-screenshot-emulator` might help.");
    }
}
