package ru.whalemare.bottomsheet

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle

import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import ru.whalemare.sheetmenu.SheetMenu
import java.util.ArrayList

open class MainActivityKotlin : AppCompatActivity() {
    var needTitle = false

    var needIcons = true

    private var sheetMenu: SheetMenu? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (findViewById<CheckBox>(R.id.checkbox_title))
                .setOnCheckedChangeListener { _, isChecked -> needTitle = isChecked }

        (findViewById<CheckBox>(R.id.checkbox_icons))
                .setOnCheckedChangeListener { _, isChecked -> needIcons = isChecked }

        findViewById<View>(R.id.button_linear).setOnClickListener {
            setupLinear()
        }

        findViewById<View>(R.id.button_grid).setOnClickListener {
            setupGrid()
        }
    }

    override fun onPause() {
        super.onPause()
        sheetMenu?.dismiss()
    }

    fun setupLinear() {
        sheetMenu = SheetMenu().apply {
            titleId = if (needTitle) R.string.title else 0
            click = MenuItem.OnMenuItemClickListener {
                toast("Click on ${it.title}")
                true
            }
            menuItems = mapOf<String, Drawable?>("option 1" to ContextCompat.getDrawable(baseContext,R.drawable.ic_atom),"option 2" to null)
            showIcons = needIcons
        }
        sheetMenu?.show(this)
    }

    fun setupGrid() {
        sheetMenu = SheetMenu(
            titleId = if (needTitle) R.string.title else 0,
            menu = R.menu.menu_long_icons,
            layoutManager = GridLayoutManager(this, 3),
            click = MenuItem.OnMenuItemClickListener {
                toast("Click on ${it.title}")
                true
            },
            showIcons = needIcons
        )
        sheetMenu?.show(this)
    }
}

fun Context.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}
