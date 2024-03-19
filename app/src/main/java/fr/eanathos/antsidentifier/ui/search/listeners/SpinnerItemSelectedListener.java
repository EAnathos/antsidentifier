package fr.eanathos.antsidentifier.ui.search.listeners;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

public class SpinnerItemSelectedListener implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
        Log.d("InformationFragment", "Selected item: " + parentView.getItemAtPosition(position));

        switch (position) {
            case 1:
                Log.d("Spinner", "test");
                break;
            case 2:
                Log.d("Spinner", "test2");
                break;
            case 3:
                // Do something
                break;
            default:
                // Do something
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parentView) {
        // your code here
    }
}
