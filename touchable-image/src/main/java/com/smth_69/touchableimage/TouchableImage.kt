package com.smth_69.librarytest

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.Toast
import com.smth_69.librarytest.EMOJIS.EMOJI_FIRE

class TouchableImage : androidx.appcompat.widget.AppCompatImageView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    init {

        //            todo = delete debug log
        Log.e("DEBUG_TAG", "init")
        this.setOnClickListener {
            Toast.makeText(context, "Clicked$EMOJI_FIRE$EMOJI_FIRE$EMOJI_FIRE", Toast.LENGTH_SHORT).show()
            //            todo = delete debug log
            Log.e("DEBUG_TAG", "clicked")
            alpha = if (alpha == 0f) 1f else 0f
        }
    }



    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)


}

object EMOJIS{
    const val EMOJI_FIRE = "\uD83D\uDD25"
}