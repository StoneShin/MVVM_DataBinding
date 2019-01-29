package e.ishigishou.shawnmvvm1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import e.ishigishou.shawnmvvm1.databinding.ActivityMainBinding;
import e.ishigishou.shawnmvvm1.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel = new MainViewModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setViewModel(viewModel);
    }
}
