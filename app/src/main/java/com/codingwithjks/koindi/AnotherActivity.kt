package com.codingwithjks.koindi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codingwithjks.koindi.databinding.ActivityAnotherBinding
import com.codingwithjks.koindi.scopes.ComponentA
import org.koin.androidx.scope.activityRetainedScope
import org.koin.androidx.scope.activityScope
import org.koin.core.component.KoinScopeComponent
import org.koin.core.scope.Scope


class AnotherActivity : AppCompatActivity(),KoinScopeComponent{
    override val scope: Scope by activityScope()
    private val componentA:ComponentA by scope.inject()

    private lateinit var binding: ActivityAnotherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnotherBinding.inflate(layoutInflater)
        setContentView(binding.root)
        componentA.getA()

    }

}