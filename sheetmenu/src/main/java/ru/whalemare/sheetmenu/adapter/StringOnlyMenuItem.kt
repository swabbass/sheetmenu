package ru.whalemare.sheetmenu.adapter

import android.content.Intent
import android.graphics.drawable.Drawable
import android.support.v4.view.MenuItemCompat
import android.view.*

class StringOnlyMenuItem(private var menuTitle: String, private var drawable: Drawable?) : MenuItem {
    override fun expandActionView(): Boolean = false

    override fun hasSubMenu(): Boolean = false

    override fun getMenuInfo(): ContextMenu.ContextMenuInfo {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(): Int = menuTitle.hashCode()

    override fun getAlphabeticShortcut(): Char {
        return menuTitle[0]
    }

    override fun setEnabled(enabled: Boolean): MenuItem {
        return this
    }

    override fun setTitle(title: CharSequence?): MenuItem {
        menuTitle = title?.toString() ?: ""
        return this

    }

    override fun setTitle(title: Int): MenuItem {
        return this
    }

    override fun setChecked(checked: Boolean): MenuItem {
        return this
    }

    override fun getActionView(): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTitle(): CharSequence {
        return menuTitle
    }

    override fun getOrder(): Int {
        return 0
    }

    override fun setOnActionExpandListener(listener: MenuItem.OnActionExpandListener?): MenuItem {
        return this
    }

    override fun getIntent(): Intent {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setVisible(visible: Boolean): MenuItem {
        return this
    }

    override fun isEnabled(): Boolean {
        return true
    }

    override fun isCheckable(): Boolean {
        return false
    }

    override fun setShowAsAction(actionEnum: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGroupId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setActionProvider(actionProvider: ActionProvider?): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setTitleCondensed(title: CharSequence?): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNumericShortcut(): Char {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isActionViewExpanded(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun collapseActionView(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isVisible(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNumericShortcut(numericChar: Char): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setActionView(view: View?): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setActionView(resId: Int): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAlphabeticShortcut(alphaChar: Char): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setIcon(icon: Drawable?): MenuItem {
        this.drawable = icon
        return this
    }

    override fun setIcon(iconRes: Int): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isChecked(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setIntent(intent: Intent?): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setShortcut(numericChar: Char, alphaChar: Char): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getIcon(): Drawable? = drawable

    override fun setShowAsActionFlags(actionEnum: Int): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setOnMenuItemClickListener(menuItemClickListener: MenuItem.OnMenuItemClickListener?): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getActionProvider(): ActionProvider {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCheckable(checkable: Boolean): MenuItem {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSubMenu(): SubMenu {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTitleCondensed(): CharSequence {
        return menuTitle
    }
}