package br.gov.sp.etec.appdavalen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = Intent(this, PainelActivity::class.java)
        val btnLogin = findViewById<Button>(R.id.buttonLogin)
        val editTextEmailLogin = findViewById<EditText>(R.id.editTextEmailLogin)
        val editTextPasswordLogin = findViewById<EditText>(R.id.editTextPasswordLogin)
        btnLogin.setOnClickListener {
            if (editTextEmailLogin.text.isEmpty() || editTextPasswordLogin.text.isEmpty()) {
                Toast.makeText(this, "Todos os campos devem estar preenchidos.", Toast.LENGTH_LONG,).show()
            } else {
                if(editTextEmailLogin.text.toString().equals("teste@teste.com") && editTextPasswordLogin.text.toString().equals("123")) {
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Usuário ou senha inválidos.", Toast.LENGTH_LONG,).show()
                }
            }
        }

        val intent2 = Intent(this, CadastroActivity::class.java)
        val btnCadas = findViewById<Button>(R.id.btnCad)
        btnCadas.setOnClickListener {
            startActivity(intent2)
        }

    }
}