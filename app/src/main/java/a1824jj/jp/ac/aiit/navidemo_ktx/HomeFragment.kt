package a1824jj.jp.ac.aiit.navidemo_ktx

import a1824jj.jp.ac.aiit.navidemo_ktx.databinding.FragmentHomeBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.button.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }
        return binding.root
    }

}
