package fr.eanathos.antsidentifier.ui.search;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import fr.eanathos.antsidentifier.R;
import fr.eanathos.antsidentifier.databinding.FragmentSearchBinding;
import fr.eanathos.antsidentifier.ui.search.listeners.SpinnerItemSelectedListener;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSearchBinding.inflate(inflater, container, false);

        TextView textViewWelcome = binding.getRoot().findViewById(R.id.textViewWelcome);

        TypedArray styledAttributes = requireContext().getTheme().obtainStyledAttributes(
                new int[] { android.R.attr.colorPrimary });
        int colorPrimary = styledAttributes.getColor(0, Color.BLACK);
        styledAttributes.recycle();

        String welcomeText = getString(R.string.search_welcome);
        SpannableString spannableString = new SpannableString(welcomeText);

        int startIndex = welcomeText.indexOf("Antarium");
        int endIndex = startIndex + "Antarium".length();

        spannableString.setSpan(new ForegroundColorSpan(colorPrimary), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textViewWelcome.setText(spannableString);

        Spinner castSpinner = binding.getRoot().findViewById(R.id.cast_spinner);
        castSpinner.setOnItemSelectedListener(new SpinnerItemSelectedListener());

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}