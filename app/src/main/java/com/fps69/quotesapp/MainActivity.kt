package com.fps69.quotesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.fps69.quotesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding

    lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        mainViewModel= ViewModelProvider(this@MainActivity, MainViewModelFactory(application)).get(MainViewModel::class.java)

        setQuote(mainViewModel.getQuote())


        binding.apply {
            BTNNext.setOnClickListener {
                setQuote(mainViewModel.nextQuote())
            }
            BTNPrevious.setOnClickListener {
                setQuote(mainViewModel.previousQuote())
            }

            BTNShare.setOnClickListener {
                val intent = Intent(Intent.ACTION_SEND)
                intent.setType("text/plain")
                intent.putExtra(Intent.EXTRA_TEXT, mainViewModel.getQuote().text)
                startActivity(intent)
            }
        }

    }

    private fun setQuote(quote: Quote) {
        binding.quoteText.text= quote.text
        binding.quoteAuthor.text=quote.author
    }
}