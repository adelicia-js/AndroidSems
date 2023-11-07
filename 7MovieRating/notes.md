1. XML element for rating bar:

        <RatingBar
            android:scaleX="0.7"
            android:scaleY="0.7"
            android:theme="@style/RatingBar"
        />

2. To use the style in the theme property mentioned above, go to  `res/values/themes.xml` & add this:

        <style name="RatingBar" parent="Theme.AppCompat">

            <!-- default color -->
            <item name="colorControlNormal">#443C43</item>
        
            <!-- color when selected -->
            <item name="colorControlActivated">#EB88D5</item>
        </style>