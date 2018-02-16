package com.example.basicservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by usuario on 16/02/18.
 */

public class MiService extends Service {

    // Un service no debe tener interacción la vista, NUNCA
    // Se comunica con la Activity y entonces con la Activity responde

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Toast.makeText(this, "Servicio iniciado", Toast.LENGTH_SHORT).show();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "Servicio destruido", Toast.LENGTH_SHORT).show();
    }
}
