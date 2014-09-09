package at.wada811.dialog.sample.alertdialogfragment.examples;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import at.wada811.dialog.AlertDialogFragment;
import at.wada811.dialog.interfaces.DialogFragmentCallbackProvider;
import at.wada811.dialog.sample.Example;
import at.wada811.dialog.sample.R;

/**
 * Created by wada on 2014/09/07.
 */
public class BasicAlertDialogExample extends Example{

    private Context context;

    public BasicAlertDialogExample(Context context){
        super(BasicAlertDialogExample.class.getSimpleName());
        this.context = context;
    }

    @Override
    public void showDialog(DialogFragmentCallbackProvider provider, FragmentManager fragmentManager){
        new AlertDialogFragment.Builder(context).setIcon(R.drawable.ic_launcher)
            .setTitle(R.string.dialog_title)
            .setMessage(R.string.dialog_message)
            .setPositiveButton(R.string.dialog_ok, null)
            .setNegativeButton(R.string.dialog_cancel, null)
            .show(fragmentManager, label);
    }

}