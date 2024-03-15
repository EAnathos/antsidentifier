package fr.eanathos.antsidentifier.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import fr.eanathos.antsidentifier.R;
import fr.eanathos.antsidentifier.databinding.FragmentSearchBinding;
import fr.eanathos.antsidentifier.ui.search.listeners.SpinnerItemSelectedListener;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_search, null);
        Spinner spinner = (Spinner) root.findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new SpinnerItemSelectedListener());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}