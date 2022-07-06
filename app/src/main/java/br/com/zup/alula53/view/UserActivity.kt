package br.com.zup.alula53.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import br.com.zup.alula53.databinding.ActivityUserBinding
import br.com.zup.alula53.viewmodel.UserViewModel

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    private val viewModel: UserViewModel by lazy {
        ViewModelProvider(this)[UserViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindingView()
        binding.btnSalvar.setOnClickListener {
            viewModel.saveInformation(
                binding.etLogin.text.toString(),
                binding.etPassword.text.toString().toInt()
            )
        }
    }

    private fun bindingView() {
        binding.etLogin.setText(viewModel.getLogin())
        binding.etPassword.setText(viewModel.getPassoword().toString())
    }

}