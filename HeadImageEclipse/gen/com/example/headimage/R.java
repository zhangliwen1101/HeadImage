/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.example.headimage;

public final class R {
    public static final class anim {
        public static final int push_bottom_in=0x7f040000;
        public static final int push_bottom_out=0x7f040001;
    }
    public static final class attr {
        /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int civ_border_color=0x7f010001;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int civ_border_overlay=0x7f010002;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int civ_border_width=0x7f010000;
        /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int civ_fill_color=0x7f010003;
    }
    public static final class color {
        public static final int colorAccent=0x7f050002;
        public static final int colorPrimary=0x7f050000;
        public static final int colorPrimaryDark=0x7f050001;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f060000;
        public static final int activity_vertical_margin=0x7f060001;
    }
    public static final class drawable {
        public static final int ic_avatar=0x7f020000;
        public static final int ic_launcher=0x7f020001;
        public static final int shape_rectangle_selectimg=0x7f020002;
    }
    public static final class id {
        public static final int action_settings=0x7f0a0008;
        public static final int button=0x7f0a0002;
        public static final int button2=0x7f0a0003;
        public static final int cancelBtn=0x7f0a0007;
        public static final int civ_avatar=0x7f0a0001;
        public static final int pickPhotoBtn=0x7f0a0006;
        public static final int pop_layout=0x7f0a0004;
        public static final int rl_root=0x7f0a0000;
        public static final int takePhotoBtn=0x7f0a0005;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int layout_dialog_pic=0x7f030001;
    }
    public static final class menu {
        public static final int main=0x7f090000;
    }
    public static final class string {
        public static final int action_settings=0x7f070001;
        public static final int app_name=0x7f070000;
        public static final int hello_world=0x7f070002;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.

    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.

        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f080000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f080001;
        /**  选择头像选择框动画 
         */
        public static final int PopupAnimation=0x7f080002;
    }
    public static final class styleable {
        /** Attributes that can be used with a CircleImageView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #CircleImageView_civ_border_color com.example.headimage:civ_border_color}</code></td><td></td></tr>
           <tr><td><code>{@link #CircleImageView_civ_border_overlay com.example.headimage:civ_border_overlay}</code></td><td></td></tr>
           <tr><td><code>{@link #CircleImageView_civ_border_width com.example.headimage:civ_border_width}</code></td><td></td></tr>
           <tr><td><code>{@link #CircleImageView_civ_fill_color com.example.headimage:civ_fill_color}</code></td><td></td></tr>
           </table>
           @see #CircleImageView_civ_border_color
           @see #CircleImageView_civ_border_overlay
           @see #CircleImageView_civ_border_width
           @see #CircleImageView_civ_fill_color
         */
        public static final int[] CircleImageView = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003
        };
        /**
          <p>This symbol is the offset where the {@link com.example.headimage.R.attr#civ_border_color}
          attribute's value can be found in the {@link #CircleImageView} array.


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.example.headimage:civ_border_color
        */
        public static final int CircleImageView_civ_border_color = 1;
        /**
          <p>This symbol is the offset where the {@link com.example.headimage.R.attr#civ_border_overlay}
          attribute's value can be found in the {@link #CircleImageView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.example.headimage:civ_border_overlay
        */
        public static final int CircleImageView_civ_border_overlay = 2;
        /**
          <p>This symbol is the offset where the {@link com.example.headimage.R.attr#civ_border_width}
          attribute's value can be found in the {@link #CircleImageView} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.example.headimage:civ_border_width
        */
        public static final int CircleImageView_civ_border_width = 0;
        /**
          <p>This symbol is the offset where the {@link com.example.headimage.R.attr#civ_fill_color}
          attribute's value can be found in the {@link #CircleImageView} array.


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.example.headimage:civ_fill_color
        */
        public static final int CircleImageView_civ_fill_color = 3;
    };
}
