# NativeStackBlur
Android StackBlur with gradle support (only for the native method) https://github.com/kikoso/android-stackblur

As you may see, kikoso has not yet provided a way to add StackBlur as a gradle dependency easily. This library is an attempt to make the NativeBlurProcess availible through gradle without the need to import any modules or do any other configuration.

[![Build Status](https://travis-ci.org/Commit451/NativeStackBlur.svg?branch=master)](https://travis-ci.org/Commit451/NativeStackBlur)  [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-NativeStackBlur-green.svg?style=flat)](https://android-arsenal.com/details/1/2495)

# Gradle Dependency

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Then, add the library to your project `build.gradle`
```gradle
dependencies {
    compile 'com.github.Commit451:NativeStackBlur:1.0.3'
}
```

This library is provided as a "fat" aar with native binaries for all available architectures. To
reduce your APK size, use the ABI filtering/splitting techniques in the Android plugin:
http://tools.android.com/tech-docs/new-build-system/user-guide/apk-splits

# Usage
Usage is similar to StackBlur, but also more streamlined:

```java
Bitmap bm = NativeStackBlur.process(source, blurRadius);
```

# Compiling
If you want to compile the original StackBlur lib for various reasons, such as adding more architecture support, simply pull down the original StackBlur repo, navigate to the StackBlur project folder (with the res and src folders). Delete the `x86` and other folders containing `.so` files. Also, remove the `<uses-sdk` block from the manifest. You will probably also get errors relating to LOCAL_SRC_FILES pointing to a missing file. Since we do not support Renderscript, just open up the `Android.mk` file and remove the `ifneq` block. Now, run `ndk-build`. This should output all the .so files you need within the /libs folder (ignoring the renderscript-v8.jar). This process works with commit cf19121553f50f346c48eabc7ebf04d27b074f17 of [android-stackblur](https://github.com/kikoso/android-stackblur)

License
--------

    Copyright 2015 Commit 451

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
