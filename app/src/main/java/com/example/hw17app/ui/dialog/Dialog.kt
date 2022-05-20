package com.example.hw17app.ui.dialog

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.example.hw17app.R
import com.example.hw17app.ui.movieList.MovieListViewModel

class Dialog : DialogFragment() {
    val viewModel: MovieListViewModel by viewModels()
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setMessage("white the name of movie you want to find ")
                .setTitle("SEARCH")
                .setView(R.id.dialog_layout)
//                .setPositiveButton("YES",
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // START THE GAME!
//                        //vModel.delete()
//                        dismiss()
//                    })
                .setNegativeButton("NO",
                    DialogInterface.OnClickListener { dialog, id ->
                        // User cancelled the dialog
                        dismiss()
                    })
            // Create the AlertDialog object and return it
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}
