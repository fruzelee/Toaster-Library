package com.crevado.fr.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Fazle Rabbi 26,January,2020.
 * ┌────────────────────────────────────────
 * │ Web: https://fr.crevado.com
 * ├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄
 * │ Email: fazle.rabbi.cse@gmail.com
 * └────────────────────────────────────────
 */
public class ToasterMessage {
    public static void s(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
