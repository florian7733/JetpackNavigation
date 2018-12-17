package de.florian.tutorial.jetpacknavigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

/**
 * from https://medium.com/@prasannajeet/using-the-navigation-architecture-component-in-android-jetpack-kotlin-48d4167ec9e5
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val host = NavHostFragment.create(R.navigation.welcome_nav_graph)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, host)
            .setPrimaryNavigationFragment(host)
            .commit()
    }
}
