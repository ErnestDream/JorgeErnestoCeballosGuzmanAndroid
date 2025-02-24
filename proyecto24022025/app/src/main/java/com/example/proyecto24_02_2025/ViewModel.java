package com.example.proyecto24_02_2025;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class ViewModel extends ViewModelNavigable {
    @Override
    public void navigate(Context context, Class actividad) {
        Intent i = new Intent(context, actividad);
        context.startActivity(i);
    }
}
