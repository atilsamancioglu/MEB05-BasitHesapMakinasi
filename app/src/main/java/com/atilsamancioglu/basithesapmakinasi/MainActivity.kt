package com.atilsamancioglu.basithesapmakinasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sayi1 : Int? = null
    var sayi2 : Int? = null
    var sonuc : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun toplama(view:View){

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null) {
            textView.text = "Sayıyı girmeyi unutmayın!"
        } else {
            sonuc = sayi1!! + sayi2!!
            textView.text = "Sonuç: ${sonuc}"
        }

    }

    fun cikarma(view:View){

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null) {
            textView.text = "Sayıyı girmeyi unutmayın!"
        } else {
            sonuc = sayi1!! - sayi2!!
            textView.text = "Sonuç: ${sonuc}"
        }


    }

    fun carpma (view : View){

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null) {
            textView.text = "Sayıyı girmeyi unutmayın!"
        } else {
            sonuc = sayi1!! * sayi2!!
            textView.text = "Sonuç: ${sonuc}"
        }


    }

    fun bolme(view : View){

        sayi1 = editText.text.toString().toIntOrNull()
        sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null) {
            textView.text = "Sayıyı girmeyi unutmayın!"
        } else {
            sonuc = sayi1!! / sayi2!!
            textView.text = "Sonuç: ${sonuc}"
        }


    }
}