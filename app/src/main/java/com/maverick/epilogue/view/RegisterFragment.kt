package com.maverick.epilogue.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.maverick.epilogue.R
import com.maverick.epilogue.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding:FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        var reg_username = binding.txtUsernameRegister.text.toString()
        var reg_display_name = binding.txtDisplayName.text.toString()
        var reg_password = binding.txtPasswordRegister.text.toString()
        var reg_confirm_password = binding.txtPasswordConfirm.text.toString()
        
        if (reg_password == reg_confirm_password){
            
        }
        else{
            Toast.makeText(requireContext(), "Please retype the same password", Toast.LENGTH_SHORT).show()
        }
    }

}