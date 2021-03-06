package a1824jj.jp.ac.aiit.navidemo_ktx

import a1824jj.jp.ac.aiit.navidemo_ktx.databinding.FragmentSecondBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        val input = arguments!!.getString("user_input")
        binding.textView.text = input

        return binding.root
    }

}
