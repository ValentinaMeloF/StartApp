package br.gov.sp.etec.appdavalen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PainelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_painel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnVagasOcup = findViewById<Button>(R.id.btnVagasOcup)
        btnVagasOcup.setOnClickListener {
            val intent =  Intent(this, VagasOcupActivity::class.java)
            startActivity(intent)
        }

        val btnVagasLiv = findViewById<Button>(R.id.btnVagasLiv)
        btnVagasLiv.setOnClickListener {
            val intent2 = Intent(this, VagasLivActivity::class.java)
            startActivity(intent2)
        }

        val btnSaida = findViewById<Button>(R.id.btnSaida)
        btnSaida.setOnClickListener {
            val intent3 = Intent(this, SaidaActivity::class.java)
            startActivity(intent3)
        }

        val btnEntrada = findViewById<Button>(R.id.btnEntrada)
        btnEntrada.setOnClickListener {
            val intent4 = Intent(this, EntradaActivity::class.java)
            startActivity(intent4)
        }

        val btnHist = findViewById<Button>(R.id.btnHist)
        btnHist.setOnClickListener {
            val intent5 = Intent(this, HistActivity::class.java)
            startActivity(intent5)
        }
    }
}