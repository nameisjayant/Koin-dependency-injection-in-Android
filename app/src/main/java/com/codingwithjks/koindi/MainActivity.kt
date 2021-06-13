package com.codingwithjks.koindi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.codingwithjks.koindi.container.BaseApplication
import com.codingwithjks.koindi.data.model.User
import com.codingwithjks.koindi.databinding.ActivityMainBinding
import com.codingwithjks.koindi.ui.MainViewModel
import com.codingwithjks.koindi.util.showMsg
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val mainViewModel:MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val baseApp = BaseApplication()
        baseApp.car.getCar()
        baseApp.main.getDemo()
        baseApp.singletonClass.getSingleton()
        mainViewModel.getDemo()
        baseApp.mainUser.getAllUser()

//        lifecycleScope.launchWhenStarted {
//            mainViewModel.getPost().catch { e->
//                Log.d("main", "onCreate: ${e.message}")
//            }.collect {response->
//                Log.d("main", "onCreate: $response ")
//            }
//        }
        insertToRoomDatabase()
        lifecycleScope.launchWhenStarted {
            mainViewModel.getAllUser.catch {e->
                Log.d("main", "onCreate:${e.message} ")
            }.collect {
                Log.d("main", "onCreate: $it")
            }
        }
    }

    private fun insertToRoomDatabase() {
        binding.apply {
            save.setOnClickListener {
                if(!TextUtils.isEmpty(name.text.toString())){
                    mainViewModel.insert(User(name.text.toString()))
                    showMsg("Data added successfully..")
                }else{
                    showMsg("please fill all the fields..")
                }
            }
        }
    }

}

