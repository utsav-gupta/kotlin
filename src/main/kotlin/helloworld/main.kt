package helloworld

import browser.tabs.ExecuteScriptDetails
import browser.tabs.QueryInfo
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.await
import org.w3c.dom.HTMLSelectElement
import kotlin.browser.document

external fun alert(url: Any?): Unit
fun getCurrentTabUrlAsync() =
        async {
            val queryInfo = QueryInfo {
                active = true
                currentWindow = true
            }
            val tabs = browser.tabs.query(queryInfo).await()
            val tab = tabs[0]
            val url = tab.url
            url ?: throw RuntimeException("tab.url should be a string")
        }


fun main(args: Array<String>) {
    document.onContentLoadedEventAsync {
        val url = getCurrentTabUrlAsync().await()
       alert(url)
    }
}
