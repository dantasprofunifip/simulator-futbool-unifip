package mobile.fip.simfut.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mobile.fip.simfut.databinding.ActivityMainBinding;

public class MenuActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}