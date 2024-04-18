package com.amaurypm.list.utils

import android.app.Activity
import android.widget.Toast

fun Activity.mensaje(text: String, length: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, text, length).show()
}