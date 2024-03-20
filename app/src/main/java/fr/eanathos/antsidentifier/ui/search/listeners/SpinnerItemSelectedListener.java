package fr.eanathos.antsidentifier.ui.search.listeners;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

public class SpinnerItemSelectedListener implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        Log.d("rootView", String.valueOf(parent.getRootView()));

        switch (parent.getId()) {
            case 2131296777:
                if (selectedItem.equals("Reine") || selectedItem.equals("Ouvrière") || selectedItem.equals("Mâle")) {
                    // Ne rien faire ici pour le moment
                } else {

                }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Ne rien faire ici pour le moment
    }
}
