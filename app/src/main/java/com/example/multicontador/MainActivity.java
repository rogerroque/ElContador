package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contadorGlobal;
    int contador1;
    int contador2;
    int contador3;
    int contador4;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.contador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1++;
                contadorGlobal++;
                binding.texto1.setText(String.valueOf(contador1));
                binding.contadorglobal.setText(String.valueOf(contadorGlobal));
            }
        });

        binding.contador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                contadorGlobal++;
                binding.texto2.setText(String.valueOf(contador2));
                binding.contadorglobal.setText(String.valueOf(contadorGlobal));
            }
        });

        binding.contador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                contadorGlobal++;
                binding.texto3.setText(String.valueOf(contador3));
                binding.contadorglobal.setText(String.valueOf(contadorGlobal));
            }
        });

        binding.contador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                contadorGlobal++;
                binding.texto4.setText(String.valueOf(contador4));
                binding.contadorglobal.setText(String.valueOf(contadorGlobal));
            }
        });

        binding.resetall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.contadorglobal.setText("0");
                binding.texto1.setText("0");
                binding.texto2.setText("0");
                binding.texto3.setText("0");
                binding.texto4.setText("0");

                contadorGlobal = 0;
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;

            }
        });

        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGlobal = contadorGlobal - contador1;
                binding.contadorglobal.setText(String.valueOf(contadorGlobal));
                binding.texto1.setText("0");
                contador1 = 0;


            }
        });

        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGlobal = contadorGlobal - contador2;
                binding.contadorglobal.setText(String.valueOf(contadorGlobal));
                binding.texto2.setText("0");
                contador2 = 0;
            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGlobal = contadorGlobal - contador3;
                binding.contadorglobal.setText(String.valueOf(contadorGlobal));
                binding.texto3.setText("0");
                contador3 = 0;
            }
        });

        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGlobal = contadorGlobal - contador4;
                binding.contadorglobal.setText(String.valueOf(contadorGlobal));
                binding.texto4.setText("0");
                contador4 = 0;
            }
        });

    }
}