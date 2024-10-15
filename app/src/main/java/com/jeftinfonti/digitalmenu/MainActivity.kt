package com.jeftinfonti.digitalmenu

import  android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jeftinfonti.digitalmenu.databinding.ActivityMainBinding

// Definição da classe de dados para representar um prato
data class Dish(val name: String, val price: Double, val time: Int) {
    constructor(name: String, price: Double) : this(name, price, 0) // Construtor secundário
}

// Classe principal da Activity
class MainActivity : AppCompatActivity(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private lateinit var binding: ActivityMainBinding
    private var total: Double = 0.0
    private lateinit var starters: List<Dish>
    private lateinit var mains: List<Dish>
    private lateinit var desserts: List<Dish>
    private lateinit var drinks: List<Dish>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura os listeners
        binding.buttonFinalizeOrder.setOnClickListener(this)
        binding.checkBoxStarters1.setOnCheckedChangeListener(this)
        binding.checkBoxStarters2.setOnCheckedChangeListener(this)
        binding.checkBoxStarters3.setOnCheckedChangeListener(this)
        binding.checkBoxStarters4.setOnCheckedChangeListener(this)
        binding.checkBoxMains1.setOnCheckedChangeListener(this)
        binding.checkBoxMains2.setOnCheckedChangeListener(this)
        binding.checkBoxMains3.setOnCheckedChangeListener(this)
        binding.checkBoxMains4.setOnCheckedChangeListener(this)
        binding.checkBoxDrinks1.setOnCheckedChangeListener(this)
        binding.checkBoxDrinks2.setOnCheckedChangeListener(this)
        binding.checkBoxDrinks3.setOnCheckedChangeListener(this)
        binding.checkBoxDesserts1.setOnCheckedChangeListener(this)
        binding.checkBoxDesserts2.setOnCheckedChangeListener(this)

        // Inicialização das listas de pratos
        starters = listOf(
            Dish("Salada Caprese", 12.0, 10),
            Dish("Bruschetta", 8.0, 8),
            Dish("Sopa de Legumes", 10.0, 10),
            Dish("Carpaccio", 15.0, 10)
        )

        mains = listOf(
            Dish("Filé Mignon", 30.0, 25),
            Dish("Salmão Grelhado", 25.0, 20),
            Dish("Penne ao Pesto", 20.0, 18),
            Dish("Risoto de Cogumelos", 22.0, 22)
        )

        drinks = listOf(
            Dish("Água Mineral", 3.0),
            Dish("Refrigerante", 5.0),
            Dish("Suco Natural", 6.0)
        )

        desserts = listOf(
            Dish("Pudim de Leite", 8.0),
            Dish("Mousse de Chocolate", 9.0)
        )

        // Configura os textos dos CheckBox com o nome, preço e tempo de preparo dos pratos
        binding.checkBoxStarters1.text = "${starters[0].name} - R$ ${starters[0].price} - Tempo : ${starters[0].time} min"
        binding.checkBoxStarters2.text = "${starters[1].name} - R$ ${starters[1].price} - Tempo : ${starters[1].time} min"
        binding.checkBoxStarters3.text = "${starters[2].name} - R$ ${starters[2].price} - Tempo : ${starters[2].time} min"
        binding.checkBoxStarters4.text = "${starters[3].name} - R$ ${starters[3].price} - Tempo : ${starters[3].time} min"

        binding.checkBoxMains1.text = "${mains[0].name} - R$ ${mains[0].price} - Tempo : ${mains[0].time} min"
        binding.checkBoxMains2.text = "${mains[1].name} - R$ ${mains[1].price} - Tempo : ${mains[1].time} min"
        binding.checkBoxMains3.text = "${mains[2].name} - R$ ${mains[2].price} - Tempo : ${mains[2].time} min"
        binding.checkBoxMains4.text = "${mains[3].name} - R$ ${mains[3].price} - Tempo : ${mains[3].time} min"

        binding.checkBoxDrinks1.text = "${drinks[0].name} - R$ ${drinks[0].price}"
        binding.checkBoxDrinks2.text = "${drinks[1].name} - R$ ${drinks[1].price}"
        binding.checkBoxDrinks3.text = "${drinks[2].name} - R$ ${drinks[2].price}"

        binding.checkBoxDesserts1.text = "${desserts[0].name} - R$ ${desserts[0].price}"
        binding.checkBoxDesserts2.text = "${desserts[1].name} - R$ ${desserts[1].price}"
    }

    // Trata os cliques nos botões
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_finalize_order -> {
                if (total == 0.0) {
                    // Se nenhum item for selecionado, mostra um Toast informando o usuário
                    Toast.makeText(this, "Selecione pelo menos um item para finalizar o pedido", Toast.LENGTH_SHORT).show()
                } else {
                    // Caso contrário, finaliza o pedido e mostra um Toast
                    finishOrder()
                }
            }
        }
    }

    // Trata as mudanças nos CheckBox
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        // Atualiza o total com base nos itens selecionados
        val checkbox = buttonView as CheckBox
        val itemPrice = getItemPrice(checkbox.id)
        if (isChecked) {
            total += itemPrice
        } else {
            total -= itemPrice
        }
        updateTotal()
    }

    // Retorna o preço do item com base no ID do CheckBox
    private fun getItemPrice(id: Int): Double {
        return when (id) {
            R.id.checkBox_starters1 -> starters[0].price
            R.id.checkBox_starters2 -> starters[1].price
            R.id.checkBox_starters3 -> starters[2].price
            R.id.checkBox_starters4 -> starters[3].price
            R.id.checkBox_mains1 -> mains[0].price
            R.id.checkBox_mains2 -> mains[1].price
            R.id.checkBox_mains3 -> mains[2].price
            R.id.checkBox_mains4 -> mains[3].price
            R.id.checkBox_drinks1 -> drinks[0].price
            R.id.checkBox_drinks2 -> drinks[1].price
            R.id.checkBox_drinks3 -> drinks[2].price
            R.id.checkBox_desserts1 -> desserts[0].price
            R.id.checkBox_desserts2 -> desserts[1].price
            else -> 0.0
        }
    }

    // Atualiza o total exibido na tela
    private fun updateTotal() {
        binding.textSectionResult.text = "Total: R$%.2f".format(total)
    }

    // Simula o envio do pedido e mostra um Toast
    private fun finishOrder() {
        Toast.makeText(this, "Seu pedido foi enviado para o balcão do restaurante", Toast.LENGTH_LONG).show()
    }
}

