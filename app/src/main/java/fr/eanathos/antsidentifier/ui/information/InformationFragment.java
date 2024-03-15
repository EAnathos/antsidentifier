package fr.eanathos.antsidentifier.ui.information;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import fr.eanathos.antsidentifier.databinding.FragmentInformationBinding;

public class InformationFragment extends Fragment {

    private @NonNull FragmentInformationBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        InformationViewModel informationViewModel =
                new ViewModelProvider(this).get(InformationViewModel.class);
        binding = FragmentInformationBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}