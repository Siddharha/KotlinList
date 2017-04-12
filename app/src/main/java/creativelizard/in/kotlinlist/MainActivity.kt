package creativelizard.`in`.kotlinlist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var items = ArrayList<String>()
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
        btn_next.setOnClickListener {
            Toast.makeText(this@MainActivity,"Hallo Sid to Kotlin Programming Language!",Toast.LENGTH_LONG).show()
        }

        lvItems.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity,items.get(position),Toast.LENGTH_LONG).show()
        }

        btn_next.setOnClickListener {
           startActivity(Intent(this@MainActivity,ListActivity::class.java).putExtra("msg",true))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }
}
