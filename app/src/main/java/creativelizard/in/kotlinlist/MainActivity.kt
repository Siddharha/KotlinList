package creativelizard.`in`.kotlinlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val items = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadList()
        onAction()
    }



    private fun loadList() {



        items.add("item 1")
        items.add("item 2")
        items.add("item 3")
        items.add("item 4")
        items.add("item 5")
        items.add("item 6")

        lvItems.adapter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_1,items)
    }

    private fun onAction() {
        btn_ok.setOnClickListener {
            Toast.makeText(this@MainActivity,"Hallo Sid to Kotlin Programming Language!",Toast.LENGTH_LONG).show()
        }

        lvItems.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity,items.get(position),Toast.LENGTH_LONG).show()
        }
    }
}
