package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

//Criando a classe dado
class Dado(private val lados: Int) {
    //Método que retorna um número aleatório (jogando o dado)
    fun jogarDado(): Int {
        return (1..lados).random()
    }

}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * "jogarbtn" do tipo Button, recebe por id
         * VAR -> Mutável
         * VAL -> Imutável
         */

        val jogarbtn: Button = findViewById(R.id.btnJogar)

        //Criando a atividade do botão
        jogarbtn.setOnClickListener {JogarDado()}

        //Jogando uma vez, pra não ficar sem imagem de inicio
        JogarDado()
    }

    //Método
    private fun JogarDado() {
        //Cria um obj Dado com "n" lados
        val dado = Dado(6)

        // Pegando o ID do label imagem
        val fotoDado: ImageView = findViewById(R.id.imgDado)

        //Setando a imagem
        when (dado.jogarDado()) {
            1 -> fotoDado.setImageResource(R.drawable.dice_1)
            2 -> fotoDado.setImageResource(R.drawable.dice_2)
            3 -> fotoDado.setImageResource(R.drawable.dice_3)
            4 -> fotoDado.setImageResource(R.drawable.dice_4)
            5 -> fotoDado.setImageResource(R.drawable.dice_5)
            6 -> fotoDado.setImageResource(R.drawable.dice_6)
        }

        //val respTxt: TextView = findViewById(R.id.txtResp)
        //Como o método jogar retorna um int, usa-se toString para converter para String
        //respTxt.text = dado.lancarDado().toString()

    }
}



