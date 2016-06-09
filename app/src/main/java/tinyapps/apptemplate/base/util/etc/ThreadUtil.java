package tinyapps.apptemplate.base.util.etc;

import android.os.Looper;

/**
 * ThreadUtil helps to manage thread conveniently.
 *
 * @author Leonardo Taehwan Kim
 */
public class ThreadUtil {

    public static boolean isMain() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}