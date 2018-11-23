import menus.CreateProperties
import menus.Icons
import webextensions.browser

const val URL_SEARCH = "http://lenz.ir/search/[query]"

fun main(args: Array<String>) {


    browser.menus.create(CreateProperties(
            title = "جستجو در لنز"
    ))

    browser.menus.onClicked.addListener { info, _ ->
        browser.tabs.create(tabs.CreateProperties(
            url = URL_SEARCH.replace("[query]", info.selectionText ?: return@addListener)
        ))
    }
}
