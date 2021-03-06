package app.plantdiary.individualassignment3048q

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.plantdiary.individualassignment3048q.ui.main.MainFragment
import java.util.*

class MainActivity : AppCompatActivity() {
    var userInput = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
