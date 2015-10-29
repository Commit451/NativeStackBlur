# NativeStackBlur
Android StackBlur with gradle support (only for the native method) https://github.com/kikoso/android-stackblur

As you may see, kikoso has not yet provided a way to add StackBlur as a gradle dependency easily. This library is an attempt to make the NativeBlurProcess availible through gradle without the need to import any modules or do any other configuration.

[![Build Status](https://travis-ci.org/Commit451/NativeStackBlur.svg?branch=master)](https://travis-ci.org/Commit451/NativeStackBlur)  [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-NativeStackBlur-green.svg?style=flat)](https://android-arsenal.com/details/1/2495)

# Gradle Dependency
Easily reference the library in your Android projects using this dependency in your module's `build.gradle` file:

```Gradle
dependencies {
    compile 'com.commit451:NativeStackBlur:1.0.1'
}
```

# Usage
Usage is similar to StackBlur, but also more streamlined:

```java
Bitmap bm = NativeStackBlur.process(source, blurRadius);
```

# Compiling
If you want to compile the original StackBlur lib for various reasons, such as adding more architecture support, simply pull down the original StackBlur repo, navigate to the StackBlur project folder (with the res and src folders) and run `ndk-build`. This should output all the .so files you need within the /libs folder. If you want to compile without worrying about renderscript, simply open up the `Android.mk` file and remove everything after the "Renderscript" comment.

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
