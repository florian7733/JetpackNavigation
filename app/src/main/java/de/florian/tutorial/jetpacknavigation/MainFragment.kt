package de.florian.tutorial.jetpacknavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
import androidx.navigation.fragment.findNavController


class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sending data from one fragment to another fragment
        buttonWelcomeMe.setOnClickListener{

            val name = enterName.text.toString()
            if(name.isEmpty()) {
                enterName.error = "Please enter a name"
            } else {
                val action = MainFragmentDirections.actionMainFragmentToDestinationFragment()
                action.setNameToShow(name)
                findNavController().navigate(action)
            }
        }
    }
}
