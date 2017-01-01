MarkView
=========
An android custom view that displays a circle with a colored arc given a mark.

<p align="center">
<img src="http://puu.sh/hJkWQ/7f2598cb62.png" />
</p>

#Usage
###Add as a dependency
```groovy
    compile 'com.github.xiprox.markview:library:1.+'
```

###Get/Set mark
```java
    getMark()
```
```java
    setMark(int);
```
```xml
    app:mv_mark="integer"
```

###Get/Set max
Max defines the highest mark value MarkView accepts and understands. Arc degree calculation is done with regard to this maximum value too. Any given mark higher than the max will result in a `?` being displayed along with a full gray ring.

```java
    getMax()
```
```java
    setMax(int)
```
```xml
    app:mv_max="integer"
```

###Get/Set text size
```java
    getTextSize()
```
```java
    setTextSize(float)
```
```xml
    app:mv_textSize="dimension"
```

###Get/Set text color
```java
    getTextColor()
```
```java
    setTextColor(int)
```
```xml
    app:mv_textColor="color"
```

###Get/Set central text
Displays mark if not set or null
```java
    getText()
```
```java
    setText(String)
```
```xml
    app:mv_text="string"
```

###Get/Set stroke width
```java
    getStrokeWidth()
```
```java
    setStrokeWidth(float)
```
```xml
    app:mv_strokeWidth="dimension"
```

###Get/Set stroke colors
MarkView supports different colors for different marks. It works in the following way:
An array keeps all the colors. Ideally, one for every supported mark (satisfying `array.length == max`). If a color exists in the array for a given mark, that color is used. If not, the last color in the array is used. And if there are no colors at all, the default color (`#999999`) is used.

```java
    getStrokeColors()
```
```java
    setStrokeColors(int...)
```
```xml
    app:mv_strokeColors="reference"
```
**Note:** If you use the xml attribute, you should supply a string array resource which is in the following format:
```xml
<string-array name="mv_mark_colors">
    <item>#D50000</item>
    <item>#FF6D00</item>
    <item>#FFD600</item>
    <item>#8BC34A</item>
    <item>#8BC34A</item>
    ...
</string-array>
```

###Get the current stroke color
```java
    getStrokeColor()
```

###Get/Set ring width
```java
    getRingWidth()
```
```java
    setRingWidth(float)
```
```xml
    app:mv_ringWidth="dimension"
```

###Get/Set ring color
```java
    getRingColor()
```
```java
   setRingColor(int)
```
```xml
   app:mv_ringColor="color"
```

#Sample App
<a href="https://play.google.com/store/apps/details?id=tr.xip.markview.sample">
<img alt="Get it on Google Play"
src="https://developer.android.com/images/brand/en_generic_rgb_wo_45.png" />
</a>

(Apk file available in the <a href="https://github.com/xiprox/MarkView/releases">releases tab</a>.)

#License
```
Copyright (C) 2015 Ihsan Isik

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
