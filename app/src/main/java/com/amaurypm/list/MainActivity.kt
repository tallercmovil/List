package com.amaurypm.list

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.amaurypm.list.databinding.ActivityMainBinding
import com.amaurypm.list.utils.mensaje
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animes = ArrayList<Anime>()

        for (i in 1..100) {
            val animeTmp = Anime(
                i.toLong() + Random.nextLong(10000),
                "Título $i",
                "Tipo: $i",
                "Fecha $i"
            )
            animes.add(animeTmp)
        }

        val miAdapter = AnimeAdapter(this, animes)

        binding.lvMain.adapter = miAdapter

        binding.lvMain.setOnItemClickListener { parent, view, position, id ->
            /*Toast.makeText(
                this,
                "Click en elemento con la posición $position y id: $id",
                Toast.LENGTH_LONG
            ).show()*/
            val anime = parent.adapter.getItem(position) as Anime

            mensaje("Click en el elemento ${anime.titulo}")

            mensaje("Hola", Toast.LENGTH_LONG)
        }

    }
}