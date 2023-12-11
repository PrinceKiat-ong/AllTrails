package com.example.alltrailsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.SearchView
import androidx.fragment.app.Fragment
import com.example.alltrailsproject.databinding.ActivityMainBinding
import com.example.alltrailsproject.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        replaceFragment(Home())

        /// code for list view
        val trails = arrayOf("Trail 1","Trail 2","Trail 3","Trail 4","Trail 5","Trail 6","Trail 7","Trail 8","Trail 9","Trail 10",
            "Trail 11","Trail 12","Trail 13","Trail 14","Trail 15","Trail 16","Trail 17","Trail 18","Trail 19","Trail 20","Trail 21","Trail 22",
            "Trail 23","Trail 24","Trail 25","Trail 26","Trail 27","Trail 28","Trail 29","Trail 30","Trail 31","Trail 32","Trail 33")

        val userAdapter : ArrayAdapter<String> = ArrayAdapter(
            this,android.R.layout.simple_list_item_1,
            trails
        )

//       binding.trailList.adapter= userAdapter;
//
//        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                binding.searchView.clearFocus()
//                if(trails.contains(query)){
//
//                    userAdapter.filter.filter(query)
//
//                }
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                userAdapter.filter.filter(newText)
//                return false
//            }
//
//        })
        /// code for list view
        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){


                R.id.home -> replaceFragment(Home())
                R.id.weather -> replaceFragment(Weather())
                R.id.navigate -> replaceFragment(Navigation())
                R.id.save -> replaceFragment(Save())
                R.id.profile -> replaceFragment(Profile())

                else -> { 

                }
            }

            true

        }

    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
    //code for Search Bar

}