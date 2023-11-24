package com.example.chatapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.chatapplication.databinding.ActivitySignInBinding;




public class SignInActivity extends AppCompatActivity {
    private ActivitySignInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

    }
    private void setListeners(){
        binding.textCREATENewAccount.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(),SignUpActivity.class))
                );
        //binding.buttonSignIn.setOnClickListener(v -> addDataToFirestore());
    }
    /*private void addDataToFirestore(){
        FirebaseFirestore database = FirebaseFirestore.getInstance();
        HashMap<String,Object> data = new HashMap<>();
        data.put("first_name","elhoussni");
        data.put("last_name","fatimazahra");
        database.collection("users").add(data).addOnSuccessListener(documentReference -> {
            Toast.makeText(getApplicationContext(),"data inserted",Toast.LENGTH_SHORT).show();
        }).addOnFailureListener(exception ->{
            Toast.makeText(getApplicationContext(),exception.getMessage(),Toast.LENGTH_SHORT).show();
        });
    }*/
}