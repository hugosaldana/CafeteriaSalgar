package com.example.cafeteriasalgar

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.cafeteriasalgar.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.i("HomeFragment", "Called ViewModelProvider.get")
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
            R.layout.fragment_login ,container,false)

        binding.LoginButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

            binding.registrateboto.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
            }

        setHasOptionsMenu(true)
        return binding.root
    }






    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}